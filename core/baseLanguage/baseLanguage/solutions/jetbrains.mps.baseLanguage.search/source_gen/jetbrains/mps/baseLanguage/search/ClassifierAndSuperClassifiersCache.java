package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.cache.AbstractCache;
import jetbrains.mps.cache.KeyProducer;
import jetbrains.mps.cache.DataSet;
import jetbrains.mps.smodel.SNode;
import java.util.Set;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.HashSet;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import jetbrains.mps.cache.CachesManager;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import java.util.LinkedHashSet;
import jetbrains.mps.generator.JavaModelUtil_new;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.internal.collections.runtime.Sequence;

/*package*/ final class ClassifierAndSuperClassifiersCache extends AbstractCache {
  private static final KeyProducer keyProducer = new KeyProducer();
  private static final AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache> CLASSIFIERS_CACHE_CREATOR = new AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache>() {
    public DataSet create(ClassifierAndSuperClassifiersCache ownerCache) {
      return new ClassifierAndSuperClassifiersCache.ClassifiersDataSet(ownerCache.myTopClassifier, ownerCache);
    }
  };
  private static final AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache> METHODS_CACHE_CREATOR = new AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache>() {
    public DataSet create(ClassifierAndSuperClassifiersCache ownerCache) {
      return new ClassifierAndSuperClassifiersCache.MethodsDataSet(ownerCache);
    }
  };
  private static final AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache> FIELDS_CACHE_CREATOR = new AbstractCache.DataSetCreator<ClassifierAndSuperClassifiersCache>() {
    public DataSet create(ClassifierAndSuperClassifiersCache ownerCache) {
      return new ClassifierAndSuperClassifiersCache.FieldsDataSet(ownerCache);
    }
  };

  private final SNode myTopClassifier;

  private ClassifierAndSuperClassifiersCache(Object key, SNode topClassifier) {
    super(key);
    this.myTopClassifier = topClassifier;
  }

  @Override
  public Set<SModelDescriptor> getDependsOnModels(Object element) {
    Set<SModelDescriptor> dependsOnModel = new HashSet<SModelDescriptor>();
    for (SNode classifier : this.getClassifiers()) {
      SModelDescriptor descriptor = SNodeOperations.getModel(classifier).getModelDescriptor();
      assert descriptor != null : "Model descriptor is null for classifier: " + classifier;
      dependsOnModel.add(descriptor);
    }
    return dependsOnModel;
  }

  /*package*/ List<SNode> getClassifiers() {
    ClassifierAndSuperClassifiersCache.ClassifiersDataSet dataSet = (ClassifierAndSuperClassifiersCache.ClassifiersDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.ClassifiersDataSet.ID, CLASSIFIERS_CACHE_CREATOR);
    return dataSet.getClassifiers();
  }

  /*package*/ List<SNode> getMethods() {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    return dataSet.getMethods();
  }

  /*package*/ List<SNode> getOverriddenMethods(SNode method) {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    return dataSet.getOverriddenMethods(method);
  }

  /*package*/ List<SNode> getMethodsByName(String methodName) {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    List<SNode> methods = dataSet.getMethodsByName(methodName);
    if (methods == null) {
      return new ArrayList<SNode>();
    }
    return methods;
  }

  /*package*/ List<SNode> getFields() {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getFields();
  }

  /*package*/ SNode getFieldByName(String name) {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getFieldByName(name);
  }

  /*package*/ SNode getStaticFieldByName(String name) {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getStaticFieldByName(name);
  }

  /*package*/ Map<SNode, SNode> getTypeByTypeVariableMap() {
    ClassifierAndSuperClassifiersCache.ClassifiersDataSet dataSet = (ClassifierAndSuperClassifiersCache.ClassifiersDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.ClassifiersDataSet.ID, CLASSIFIERS_CACHE_CREATOR);
    return dataSet.getTypeByTypeVariableMap();
  }

  public static ClassifierAndSuperClassifiersCache getInstance(SNode topClassifierNode) {
    Object key = keyProducer.createKey(topClassifierNode);
    return (ClassifierAndSuperClassifiersCache) CachesManager.getInstance().getCache(key, topClassifierNode, new CachesManager.CacheCreator<SNode>() {
      public AbstractCache create(Object key, SNode element) {
        return new ClassifierAndSuperClassifiersCache(key, element);
      }
    });

  }

  private static final class ClassifiersDataSet extends DataSet {
    public static final String ID = "CLASSIFIERS_DATASET";

    private SNode myTopClassifier;
    private List<SNode> myClassifiers;
    private Map<SNode, SNode> myTypeByTypeVariable;
    private Set<SNode> myDependsOnNodes;

    public ClassifiersDataSet(SNode topClassifier, AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_OWNER_CACHE);
      this.myTopClassifier = topClassifier;
    }

    public List<SNode> getClassifiers() {
      return this.myClassifiers;
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    /*package*/ Map<SNode, SNode> getTypeByTypeVariableMap() {
      return this.myTypeByTypeVariable;
    }

    protected void init() {
      this.myTypeByTypeVariable = MapSequence.fromMap(new HashMap<SNode, SNode>());
      this.myClassifiers = ClassifierAndSuperClassifiersCache.ClassifiersDataSet.getImplementedAndExtended(this.myTopClassifier, this.myTypeByTypeVariable);
      this.myDependsOnNodes = SetSequence.fromSet(new HashSet<SNode>());
      for (SNode classifier : this.myClassifiers) {
        SetSequence.fromSet(this.myDependsOnNodes).addElement(classifier);
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
          for (SNode type : SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass")), "typeParameter", true)) {
            SetSequence.fromSet(this.myDependsOnNodes).addElement(type);
            SetSequence.fromSet(this.myDependsOnNodes).addSequence(ListSequence.fromList(type.getDescendants()));
          }
        } else {
          for (SNode typeVariableDecl : SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)) {
            SetSequence.fromSet(this.myDependsOnNodes).addElement(typeVariableDecl);
          }
        }
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept") && !(SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass"))) {
          SNode classifierType0 = SLinkOperations.getTarget((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "superclass", true);
          if (classifierType0 != null) {
            SetSequence.fromSet(this.myDependsOnNodes).addElement(classifierType0);
            SetSequence.fromSet(this.myDependsOnNodes).addSequence(ListSequence.fromList(classifierType0.getDescendants()));
          }
          for (SNode classifierType1 : SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "implementedInterface", true)) {
            SetSequence.fromSet(this.myDependsOnNodes).addElement(classifierType1);
            SetSequence.fromSet(this.myDependsOnNodes).addSequence(ListSequence.fromList(classifierType1.getDescendants()));
          }
        } else
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
          for (SNode classifierType : SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.Interface")), "extendedInterface", true)) {
            SetSequence.fromSet(this.myDependsOnNodes).addElement(classifierType);
            SetSequence.fromSet(this.myDependsOnNodes).addSequence(ListSequence.fromList(classifierType.getDescendants()));
          }
        }
      }
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        String role = event.getChildRole();
        if (!(("typeVariableDeclaration".equals(role) || "superclass".equals(role) || "implementedInterface".equals(role) || "extendedInterface".equals(role) || "typeParameter".equals(role)))) {
          return;
        }
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        String role = event.getChildRole();
        if (!(("typeVariableDeclaration".equals(role) || "superclass".equals(role) || "implementedInterface".equals(role) || "extendedInterface".equals(role) || "typeParameter".equals(role)))) {
          return;
        }
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
    }

    private static List<SNode> getImplementedAndExtended(SNode classifier, Map<SNode, SNode> typeByTypeVar) {
      Set<SNode> set = SetSequence.fromSet(new LinkedHashSet<SNode>());
      ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(classifier, set, null, typeByTypeVar);
      List<SNode> result = new ArrayList<SNode>();
      ListSequence.fromList(result).addSequence(SetSequence.fromSet(set));
      SNode objectClass = (SNode) JavaModelUtil_new.findClassifier("java.lang", "Object", true);
      if (objectClass != null) {
        if (!(SetSequence.fromSet(set).contains(objectClass))) {
          int indexOfFirstInterface = 0;
          for (SNode classifierInResult : set) {
            if (SNodeOperations.isInstanceOf(classifierInResult, "jetbrains.mps.baseLanguage.structure.Interface")) {
              break;
            }
            indexOfFirstInterface++;
          }
          if (indexOfFirstInterface == 0) {
            result.add(objectClass);
          } else {
            result.add(indexOfFirstInterface, objectClass);
          }
        }
      }
      return result;
    }

    private static void collectImplementedAndExtended(SNode classifier, Set<SNode> result, List<SNode> typeParms, Map<SNode, SNode> typeByTypeVar) {
      if ((classifier == null)) {
        return;
      }
      if (SetSequence.fromSet(result).contains(classifier)) {
        return;
      }
      SetSequence.fromSet(result).addElement(classifier);
      if (typeParms != null && ListSequence.fromList(typeParms).count() > 0) {
        Iterator<SNode> typeVars = ListSequence.fromList(SLinkOperations.getTargets(classifier, "typeVariableDeclaration", true)).iterator();
        for (SNode typeParm : typeParms) {
          if (!(typeVars.hasNext())) {
            break;
          }
          SNode typeVar = typeVars.next();
          MapSequence.fromMap(typeByTypeVar).put(typeVar, typeParm);
        }
      }
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass")) {
        SNode cls = SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.AnonymousClass");
        ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(SLinkOperations.getTarget(cls, "classifier", false), result, SLinkOperations.getTargets(cls, "typeParameter", true), typeByTypeVar);
      } else
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
        SNode classifierType0 = SLinkOperations.getTarget((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "superclass", true);
        if (classifierType0 != null) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(SLinkOperations.getTarget(classifierType0, "classifier", false), result, SLinkOperations.getTargets(classifierType0, "parameter", true), typeByTypeVar);
        }
        for (SNode classifierType1 : SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "implementedInterface", true)) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(SLinkOperations.getTarget(classifierType1, "classifier", false), result, SLinkOperations.getTargets(classifierType1, "parameter", true), typeByTypeVar);
        }
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.EnumClass")) {
          SNode enumClassNode = JavaModelUtil_new.findClassifier("java.lang", "Enum", true);
          if (enumClassNode != null) {
            SNode enumClassifier = SNodeOperations.cast(enumClassNode, "jetbrains.mps.baseLanguage.structure.Classifier");
            ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(enumClassifier, result, null, typeByTypeVar);
          }
        }
      } else
      if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.Interface")) {
        for (SNode classifierType : SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.Interface")), "extendedInterface", true)) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(SLinkOperations.getTarget(classifierType, "classifier", false), result, SLinkOperations.getTargets(classifierType, "parameter", true), typeByTypeVar);
        }
      }
    }
  }

  private static final class MethodsDataSet extends DataSet {
    public static final String ID = "METHODS_DATASET";

    private Map<String, List<SNode>> myMethodsByName;
    private Map<SNode, List<SNode>> myOverriddenMethods;
    private Set<SNode> myDependsOnNodes;

    public MethodsDataSet(AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_DATA_SET);
    }

    public List<SNode> getMethods() {
      List<SNode> result = new ArrayList<SNode>();
      for (List<SNode> list : MapSequence.fromMap(this.myMethodsByName).values()) {
        ListSequence.fromList(result).addSequence(ListSequence.fromList(list));
      }
      return result;
    }

    public List<SNode> getOverriddenMethods(SNode method) {
      List<SNode> list = MapSequence.fromMap(this.myOverriddenMethods).get(method);
      if (list != null) {
        return list;
      }
      return new ArrayList<SNode>();
    }

    @Nullable
    public List<SNode> getMethodsByName(String methodName) {
      return MapSequence.fromMap(myMethodsByName).get((methodName == null ?
        "" :
        methodName
      ));
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    protected void init() {
      List<SNode> allMethods = new ArrayList<SNode>();
      List<SNode> classifiers = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getClassifiers();
      for (SNode classifier : classifiers) {
        allMethods.addAll(SLinkOperations.getTargets(classifier, "method", true));
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          allMethods.addAll(SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "staticMethod", true));
        }
      }
      this.myMethodsByName = MapSequence.fromMap(new HashMap<String, List<SNode>>());
      this.myOverriddenMethods = MapSequence.fromMap(new HashMap<SNode, List<SNode>>());
forEachInAllMethods:
      for (SNode currMethod : allMethods) {
        if (SNodeOperations.isInstanceOf(currMethod, "jetbrains.mps.baseLanguage.structure.PlaceholderMethodDeclaration")) {
          continue;
        }
        String name = SPropertyOperations.getString(currMethod, "name");
        if (name == null) {
          name = "";
        }
        if (!(MapSequence.fromMap(this.myMethodsByName).containsKey(name))) {
          List<SNode> methods = new ArrayList<SNode>();
          methods.add(currMethod);
          MapSequence.fromMap(myMethodsByName).put(name, methods);
          MapSequence.fromMap(myOverriddenMethods).put(currMethod, new ArrayList<SNode>());
        } else {
          int currMethodParmCount = ListSequence.fromList(SLinkOperations.getTargets(currMethod, "parameter", true)).count();
          List<SNode> equalParmCountMethods = new ArrayList<SNode>();
          List<SNode> methods = MapSequence.fromMap(this.myMethodsByName).get(name);
          for (SNode method : methods) {
            if ((SNodeOperations.getParent(currMethod) != SNodeOperations.getParent(method)) && ListSequence.fromList(SLinkOperations.getTargets(method, "parameter", true)).count() == currMethodParmCount) {
              equalParmCountMethods.add(method);
            }
          }
          if (equalParmCountMethods.size() > 0) {
            if (currMethodParmCount == 0) {
              ListSequence.fromList(MapSequence.fromMap(myOverriddenMethods).get(ListSequence.fromList(equalParmCountMethods).first())).addElement(currMethod);
              continue forEachInAllMethods;
            }
            Map<SNode, SNode> typeByTypeVar = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getTypeByTypeVariableMap();
            String currentParms = this.createMethodParameterTypesString(currMethod, typeByTypeVar);
            for (SNode otherMethod : equalParmCountMethods) {
              String otherParms = this.createMethodParameterTypesString(otherMethod, typeByTypeVar);
              if (otherParms.equals(currentParms)) {
                MapSequence.fromMap(this.myOverriddenMethods).get(otherMethod).add(currMethod);
                continue forEachInAllMethods;
              }
            }
          }
          ListSequence.fromList(MapSequence.fromMap(myMethodsByName).get(name)).addElement(currMethod);
          MapSequence.fromMap(myOverriddenMethods).put(currMethod, new ArrayList<SNode>());
        }
      }
      this.myDependsOnNodes = SetSequence.fromSet(new HashSet<SNode>());
      for (SNode classifier : classifiers) {
        SetSequence.fromSet(this.myDependsOnNodes).addElement(classifier);
      }
      for (SNode method : allMethods) {
        SetSequence.fromSet(this.myDependsOnNodes).addElement(method);
        for (SNode parm : SLinkOperations.getTargets(method, "parameter", true)) {
          SNode type = SLinkOperations.getTarget(parm, "type", true);
          if (type == null) {
            continue;
          }
          SetSequence.fromSet(myDependsOnNodes).addElement(type);
          SetSequence.fromSet(myDependsOnNodes).addSequence(ListSequence.fromList(type.getDescendants()));
        }
      }
    }

    private String createMethodParameterTypesString(SNode method, Map<SNode, SNode> typeByTypeVar) {
      StringBuilder result = new StringBuilder();
      for (SNode parm : SLinkOperations.getTargets(method, "parameter", true)) {
        SNode type = SLinkOperations.getTarget(parm, "type", true);
        type = GenericTypesUtil.getTypeWithResolvedTypeVars(type, typeByTypeVar);
        if (result.length() > 0) {
          result.append(',');
        }
        if (type != null) {
          result.append(((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(type, "jetbrains.mps.baseLanguage.structure.Type"), "virtual_getErasureSignature_1213877337313", new Class[]{SNode.class})));
        } else {
          result.append("");
        }
      }
      return result.toString();
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        if (!(event.getChild().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"))) {
          return;
        }
      }
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
        String role = event.getChildRole();

        if (!("parameter".equals(role))) {
          return;
        }
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        if (!(event.getChild().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration"))) {
          return;
        }
      }
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
        String role = event.getChildRole();
        if (!("parameter".equals(role))) {
          return;
        }
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
      if ("name".equals(event.getPropertyName()) && event.getNode().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration")) {
        super.propertyChanged(event);
      }
    }
  }

  private static class FieldsDataSet extends DataSet {
    public static final String ID = "FIELDS_DATASET";

    private Map<String, SNode> myFieldsByName;
    private Map<String, SNode> myStaticFieldsByName;
    private Set<SNode> myDependsOnNodes;

    public FieldsDataSet(AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_DATA_SET);
    }

    public List<SNode> getFields() {
      List<SNode> result = new ArrayList<SNode>();
      ListSequence.fromList(result).addSequence(Sequence.fromIterable(MapSequence.fromMap(myFieldsByName).values()));
      ListSequence.fromList(result).addSequence(Sequence.fromIterable(MapSequence.fromMap(myStaticFieldsByName).values()));
      return result;
    }

    public SNode getFieldByName(String name) {
      return MapSequence.fromMap(myFieldsByName).get((name == null ?
        "" :
        name
      ));
    }

    public SNode getStaticFieldByName(String name) {
      return MapSequence.fromMap(myStaticFieldsByName).get((name == null ?
        "" :
        name
      ));
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    protected void init() {
      this.myFieldsByName = MapSequence.fromMap(new HashMap<String, SNode>());
      this.myStaticFieldsByName = MapSequence.fromMap(new HashMap<String, SNode>());
      List<SNode> allFields = new ArrayList<SNode>();
      List<SNode> classifiers = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getClassifiers();
      for (SNode classifier : classifiers) {
        List<SNode> staticFields = SLinkOperations.getTargets(classifier, "staticField", true);
        allFields.addAll(staticFields);
        for (SNode staticField : staticFields) {
          String name = SPropertyOperations.getString(staticField, "name");
          if (name == null) {
            name = "";
          }
          if (!(MapSequence.fromMap(myStaticFieldsByName).containsKey(name))) {
            MapSequence.fromMap(myStaticFieldsByName).put(name, staticField);
          }
        }
        if (SNodeOperations.isInstanceOf(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")) {
          List<SNode> fields = SLinkOperations.getTargets((SNodeOperations.cast(classifier, "jetbrains.mps.baseLanguage.structure.ClassConcept")), "field", true);
          ListSequence.fromList(allFields).addSequence(ListSequence.fromList(fields));
          for (SNode field : fields) {
            String name = SPropertyOperations.getString(field, "name");
            if (name == null) {
              name = "";
            }
            if (!(MapSequence.fromMap(myFieldsByName).containsKey(name))) {
              MapSequence.fromMap(myFieldsByName).put(name, field);
            }
          }
        }
      }
      myDependsOnNodes = SetSequence.fromSet(new HashSet<SNode>());
      SetSequence.fromSet(myDependsOnNodes).addSequence(ListSequence.fromList(classifiers));
      SetSequence.fromSet(myDependsOnNodes).addSequence(ListSequence.fromList(allFields));
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        SNode child = event.getChild();
        if (!((SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")))) {
          return;
        }
      }
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
        return;
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.Classifier")) {
        SNode child = event.getChild();
        if (!((SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")))) {
          return;
        }
      }
      if (event.getParent().isInstanceOfConcept("jetbrains.mps.baseLanguage.structure.VariableDeclaration")) {
        return;
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
      SNode node = event.getNode();
      if ("name".equals(event.getPropertyName()) && (SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration"))) {
        super.propertyChanged(event);
      }
    }
  }
}
