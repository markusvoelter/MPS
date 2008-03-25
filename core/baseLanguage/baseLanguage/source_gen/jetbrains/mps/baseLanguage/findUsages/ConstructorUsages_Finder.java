package jetbrains.mps.baseLanguage.findUsages;

/*Generated by MPS */

import jetbrains.mps.ide.findusages.findalgorithm.finders.GeneratedFinder;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.ide.findusages.model.result.SearchResults;
import jetbrains.mps.smodel.SNodePointer;

import java.util.List;

import jetbrains.mps.ide.findusages.model.result.SearchResult;

import java.util.ArrayList;

import jetbrains.mps.ide.findusages.model.searchquery.SearchQuery;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.helgins.inference.TypeChecker;

public class ConstructorUsages_Finder extends GeneratedFinder {
  public static Logger LOG = Logger.getLogger("jetbrains.mps.baseLanguage.findUsages.ConstructorUsages_Finder");

  public boolean isVisible() {
    return true;
  }

  public String getDescription() {
    return "Constructor Usages";
  }

  public String getLongDescription() {
    return "";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration";
  }

  public boolean isApplicable(SNode node) {
    SNode queryNode = (SNode) node;
    return SNodeOperations.getAncestor(queryNode, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false) != null;
  }

  public void doFind(SNode node, IScope scope, SearchResults results) {
    results.getSearchedNodePointers().add(new SNodePointer(node));
    // search for straight usages & search for SUPER calls
    // BUG IN BASE LANGUAGE -- AT THE TIME THIS THING DOES NOT FIND SUPER() CALLS
    List<SearchResult> straightUsagesRes = new ArrayList<SearchResult>();
    try {
      GeneratedFinder _finder = (GeneratedFinder) Class.forName("jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder").newInstance();
      SNode _node = node;
      IScope _scope;
      _scope = scope;
      boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.core.structure.BaseConcept");
      if (!(rightConcept)) {
        ConstructorUsages_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + node.getConceptFqName());
      } else {
        boolean isApplicable = _finder.isApplicable(_node);
        if (!(isApplicable)) {
          ConstructorUsages_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + node.toString());
        } else {
          SearchResults results_16 = _finder.find(new SearchQuery(_node, _scope));
          for (SearchResult result : results_16.getSearchResults()) {
            straightUsagesRes.add(result);
          }
        }
      }
    } catch (Throwable t) {
      ConstructorUsages_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.bootstrap.structureLanguage.findUsages.NodeUsages_Finder" + "\"  Message:" + t.getMessage());
    }
    {
      ICursor<SearchResult> _zCursor11 = CursorFactory.createCursor(straightUsagesRes);
      try {
        while (_zCursor11.moveToNext()) {
          SearchResult usage = _zCursor11.getCurrent();
          results.getSearchResults().add(new SearchResult(new SNodePointer(usage.getNode()), "Constructor Usages"));
        }
      } finally {
        _zCursor11.release();
      }
    }
    // WORKAROUND - FIND SUPER() CALLS
    List<SearchResult> strightSubclassesRes = new ArrayList<SearchResult>();
    try {
      GeneratedFinder _finder = (GeneratedFinder) Class.forName("jetbrains.mps.baseLanguage.findUsages.StraightDerivedClasses_Finder").newInstance();
      SNode _node = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false);
      IScope _scope;
      _scope = scope;
      boolean rightConcept = _node.isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.ClassConcept");
      if (!(rightConcept)) {
        ConstructorUsages_Finder.LOG.error("Trying to use finder that is not applicable to the concept. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; concept: " + node.getConceptFqName());
      } else {
        boolean isApplicable = _finder.isApplicable(_node);
        if (!(isApplicable)) {
          ConstructorUsages_Finder.LOG.error("Trying to use finder that is not applicable to the node. Returning empty results." + "[finder: \"" + _finder.getDescription() + "\" ; node: " + node.toString());
        } else {
          SearchResults results_17 = _finder.find(new SearchQuery(_node, _scope));
          for (SearchResult result : results_17.getSearchResults()) {
            strightSubclassesRes.add(result);
          }
        }
      }
    } catch (Throwable t) {
      ConstructorUsages_Finder.LOG.error("Error instantiating finder \"" + "jetbrains.mps.baseLanguage.findUsages.StraightDerivedClasses_Finder" + "\"  Message:" + t.getMessage());
    }
    {
      ICursor<SearchResult> _zCursor12 = CursorFactory.createCursor(strightSubclassesRes);
      try {
        while (_zCursor12.moveToNext()) {
          SearchResult subclassResult = _zCursor12.getCurrent();
          {
            SNode classNode = (SNode) subclassResult.getNode();
            {
              ICursor<SNode> _zCursor13 = CursorFactory.createCursor(SLinkOperations.getTargets(classNode, "constructor", true));
              try {
                while (_zCursor13.moveToNext()) {
                  SNode constructorNode = _zCursor13.getCurrent();
                  {
                    ICursor<SNode> _zCursor14 = CursorFactory.createCursor(SequenceOperations.where(SNodeOperations.getDescendants(constructorNode, null, false), new zPredicate(null, null)));
                    try {
                      while (_zCursor14.moveToNext()) {
                        SNode invocation = _zCursor14.getCurrent();
                        {
                          boolean thisConstructor = true;
                          SNode invocationNode = (SNode) invocation;
                          if (SequenceOperations.getSize(SLinkOperations.getTargets(invocationNode, "actualArgument", true)) == SequenceOperations.getSize(SLinkOperations.getTargets(node, "parameter", true))) {
                            for (int i = 0; i < SequenceOperations.getSize(SLinkOperations.getTargets(invocationNode, "actualArgument", true)); i = i + 1)
                            {
                              SNode actualArgument = ListOperations.getElement(SLinkOperations.getTargets(invocationNode, "actualArgument", true), i);
                              SNode formalArgument = ListOperations.getElement(SLinkOperations.getTargets(node, "parameter", true), i);
                              if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(actualArgument), SLinkOperations.getTarget(formalArgument, "type", true)))) {
                                thisConstructor = false;
                              }
                            }
                            if (thisConstructor) {
                              results.getSearchResults().add(new SearchResult(new SNodePointer(invocationNode), "Constructor Usages"));
                            }
                          }
                        }
                      }
                    } finally {
                      _zCursor14.release();
                    }
                  }
                }
              } finally {
                _zCursor13.release();
              }
            }
          }
        }
      } finally {
        _zCursor12.release();
      }
    }
    // search for enum constants creation
    SNode enumNode = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.EnumClass", false, false);
    if (enumNode != null) {
      {
        ICursor<SNode> _zCursor15 = CursorFactory.createCursor(SLinkOperations.getTargets(enumNode, "enumConstant", true));
        try {
          while (_zCursor15.moveToNext()) {
            SNode enumConstant = _zCursor15.getCurrent();
            {
              boolean thisConstructor = true;
              if (SequenceOperations.getSize(SLinkOperations.getTargets(enumConstant, "actualArgument", true)) == SequenceOperations.getSize(SLinkOperations.getTargets(node, "parameter", true))) {
                for (int i = 0; i < SequenceOperations.getSize(SLinkOperations.getTargets(enumConstant, "actualArgument", true)); i = i + 1)
                {
                  SNode actualArgument = ListOperations.getElement(SLinkOperations.getTargets(enumConstant, "actualArgument", true), i);
                  SNode formalArgument = ListOperations.getElement(SLinkOperations.getTargets(node, "parameter", true), i);
                  if (!(TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getTypeOf(actualArgument), SLinkOperations.getTarget(formalArgument, "type", true)))) {
                    thisConstructor = false;
                  }
                }
                if (thisConstructor) {
                  results.getSearchResults().add(new SearchResult(new SNodePointer(enumConstant), "Constructor Usages"));
                }
              }
            }
          }
        } finally {
          _zCursor15.release();
        }
      }
    }
  }

}
