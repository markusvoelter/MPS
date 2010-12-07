package jetbrains.mps.baseLanguage.search;

/*Generated by MPS */

import jetbrains.mps.cache.AbstractCache;
import jetbrains.mps.cache.KeyProducer;
import jetbrains.mps.cache.DataSet;
import jetbrains.mps.baseLanguage.structure.Classifier;
import java.util.Set;
import jetbrains.mps.smodel.SModelDescriptor;
import java.util.HashSet;
import java.util.List;
import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.structure.VariableDeclaration;
import jetbrains.mps.baseLanguage.structure.FieldDeclaration;
import jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration;
import java.util.Map;
import jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration;
import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.cache.CachesManager;
import jetbrains.mps.smodel.BaseAdapter;
import java.util.HashMap;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.structure.AnonymousClass;
import jetbrains.mps.baseLanguage.structure.ClassifierType;
import jetbrains.mps.baseLanguage.structure.Interface;
import jetbrains.mps.smodel.event.SModelChildEvent;
import jetbrains.mps.baseLanguage.structure.GenericDeclaration;
import jetbrains.mps.smodel.event.SModelPropertyEvent;
import java.util.LinkedHashSet;
import jetbrains.mps.generator.JavaModelUtil_new;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.EnumClass;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.baseLanguage.structure.PlaceholderMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.ParameterDeclaration;
import jetbrains.mps.baseLanguage.behavior.Type_Behavior;
import jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration;

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

  private final Classifier myTopClassifier;

  private ClassifierAndSuperClassifiersCache(Object key, Classifier topClassifier) {
    super(key);
    this.myTopClassifier = topClassifier;
  }

  @Override
  public Set<SModelDescriptor> getDependsOnModels(Object element) {
    Set<SModelDescriptor> dependsOnModel = new HashSet<SModelDescriptor>();
    for (Classifier classifier : this.getClassifiers()) {
      SModelDescriptor descriptor = classifier.getModel().getModelDescriptor();
      assert descriptor != null : "Model descriptor is null for classifier: " + classifier + "; model: "+classifier.getModel().toString();
      dependsOnModel.add(descriptor);
    }
    return dependsOnModel;
  }

  /*package*/ List<Classifier> getClassifiers() {
    ClassifierAndSuperClassifiersCache.ClassifiersDataSet dataSet = (ClassifierAndSuperClassifiersCache.ClassifiersDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.ClassifiersDataSet.ID, CLASSIFIERS_CACHE_CREATOR);
    return dataSet.getClassifiers();
  }

  /*package*/ List<BaseMethodDeclaration> getMethods() {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    return dataSet.getMethods();
  }

  /*package*/ List<BaseMethodDeclaration> getOverriddenMethods(BaseMethodDeclaration method) {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    return dataSet.getOverriddenMethods(method);
  }

  /*package*/ List<BaseMethodDeclaration> getMethodsByName(String methodName) {
    ClassifierAndSuperClassifiersCache.MethodsDataSet dataSet = (ClassifierAndSuperClassifiersCache.MethodsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.MethodsDataSet.ID, METHODS_CACHE_CREATOR);
    List<BaseMethodDeclaration> methods = dataSet.getMethodsByName(methodName);
    if (methods == null) {
      return new ArrayList<BaseMethodDeclaration>();
    }
    return methods;
  }

  /*package*/ List<VariableDeclaration> getFields() {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getFields();
  }

  /*package*/ FieldDeclaration getFieldByName(String name) {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getFieldByName(name);
  }

  /*package*/ StaticFieldDeclaration getStaticFieldByName(String name) {
    ClassifierAndSuperClassifiersCache.FieldsDataSet dataSet = (ClassifierAndSuperClassifiersCache.FieldsDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.FieldsDataSet.ID, FIELDS_CACHE_CREATOR);
    return dataSet.getStaticFieldByName(name);
  }

  /*package*/ Map<TypeVariableDeclaration, Type> getTypeByTypeVariableMap() {
    ClassifierAndSuperClassifiersCache.ClassifiersDataSet dataSet = (ClassifierAndSuperClassifiersCache.ClassifiersDataSet) this.getDataSet(ClassifierAndSuperClassifiersCache.ClassifiersDataSet.ID, CLASSIFIERS_CACHE_CREATOR);
    return dataSet.getTypeByTypeVariableMap();
  }

  /*package*/ static ClassifierAndSuperClassifiersCache getInstance(Classifier topClassifier) {
    SNode node = topClassifier.getNode();
    Object key = keyProducer.createKey(node);
    return (ClassifierAndSuperClassifiersCache) CachesManager.getInstance().getCache(key, topClassifier, new CachesManager.CacheCreator<Classifier>() {
      public AbstractCache create(Object key, Classifier element) {
        return new ClassifierAndSuperClassifiersCache(key, element);
      }
    });
  }

  public static ClassifierAndSuperClassifiersCache getInstance(SNode topClassifierNode) {
    return ClassifierAndSuperClassifiersCache.getInstance((Classifier) BaseAdapter.fromNode(topClassifierNode));
  }

  private static final class ClassifiersDataSet extends DataSet {
    public static final String ID = "CLASSIFIERS_DATASET";

    private Classifier myTopClassifier;
    private List<Classifier> myClassifiers;
    private Map<TypeVariableDeclaration, Type> myTypeByTypeVariable;
    private Set<SNode> myDependsOnNodes;

    public ClassifiersDataSet(Classifier topClassifier, AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_OWNER_CACHE);
      this.myTopClassifier = topClassifier;
    }

    public List<Classifier> getClassifiers() {
      return this.myClassifiers;
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    /*package*/ Map<TypeVariableDeclaration, Type> getTypeByTypeVariableMap() {
      return this.myTypeByTypeVariable;
    }

    protected void init() {
      this.myTypeByTypeVariable = new HashMap<TypeVariableDeclaration, Type>();
      this.myClassifiers = ClassifierAndSuperClassifiersCache.ClassifiersDataSet.getImplementedAndExtended(this.myTopClassifier, this.myTypeByTypeVariable);
      this.myDependsOnNodes = new HashSet<SNode>();
      for (Classifier classifier : this.myClassifiers) {
        this.myDependsOnNodes.add(classifier.getNode());
        for (TypeVariableDeclaration typeVariableDecl : classifier.getTypeVariableDeclarations()) {
          this.myDependsOnNodes.add(typeVariableDecl.getNode());
        }
        if (classifier instanceof ClassConcept && !((classifier instanceof AnonymousClass))) {
          ClassifierType classifierType0 = ((ClassConcept) classifier).getSuperclass();
          if (classifierType0 != null) {
            SNode node = classifierType0.getNode();
            this.myDependsOnNodes.add(node);
            this.myDependsOnNodes.addAll(node.getDescendants());
          }
          for (ClassifierType classifierType1 : ((ClassConcept) classifier).getImplementedInterfaces()) {
            SNode node = classifierType1.getNode();
            this.myDependsOnNodes.add(node);
            this.myDependsOnNodes.addAll(node.getDescendants());
          }
        } else
        if (classifier instanceof Interface) {
          for (ClassifierType classifierType : ((Interface) classifier).getExtendedInterfaces()) {
            SNode node = classifierType.getNode();
            this.myDependsOnNodes.add(node);
            this.myDependsOnNodes.addAll(node.getDescendants());
          }
        }
      }
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        String role = event.getChildRole();
        if (!((GenericDeclaration.TYPE_VARIABLE_DECLARATION.equals(role) || ClassConcept.SUPERCLASS.equals(role) || ClassConcept.IMPLEMENTED_INTERFACE.equals(role) || Interface.EXTENDED_INTERFACE.equals(role)))) {
          return;
        }
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        String role = event.getChildRole();
        if (!((GenericDeclaration.TYPE_VARIABLE_DECLARATION.equals(role) || ClassConcept.SUPERCLASS.equals(role) || ClassConcept.IMPLEMENTED_INTERFACE.equals(role) || Interface.EXTENDED_INTERFACE.equals(role)))) {
          return;
        }
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
    }

    private static List<Classifier> getImplementedAndExtended(Classifier classifier, Map<TypeVariableDeclaration, Type> typeByTypeVar) {
      Set<Classifier> set = new LinkedHashSet<Classifier>();
      ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(classifier, set, null, typeByTypeVar);
      ArrayList<Classifier> result = new ArrayList<Classifier>(set);
      SNode objectClassNode = JavaModelUtil_new.findClassifier("java.lang", "Object", true);
      if (objectClassNode != null) {
        Classifier objectClass = (Classifier) objectClassNode.getAdapter();
        if (!(set.contains(objectClass))) {
          int indexOfFirstInterface = 0;
          for (Classifier classifierInResult : set) {
            if (classifierInResult instanceof Interface) {
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

    private static void collectImplementedAndExtended(Classifier classifier, Set<Classifier> result, List<Type> typeParms, Map<TypeVariableDeclaration, Type> typeByTypeVar) {
      if (classifier == null) {
        return;
      }
      if (result.contains(classifier)) {
        return;
      }
      result.add(classifier);
      if (typeParms != null && typeParms.size() > 0) {
        Iterator<TypeVariableDeclaration> typeVars = classifier.typeVariableDeclarations();
        for (Type typeParm : typeParms) {
          if (!(typeVars.hasNext())) {
            break;
          }
          TypeVariableDeclaration typeVar = typeVars.next();
          typeByTypeVar.put(typeVar, typeParm);
        }
      }
      if (classifier instanceof AnonymousClass) {
        AnonymousClass cls = (AnonymousClass) classifier;
        ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(cls.getClassifier(), result, cls.getTypeParameters(), typeByTypeVar);
      } else
      if (classifier instanceof ClassConcept) {
        ClassifierType classifierType0 = ((ClassConcept) classifier).getSuperclass();
        if (classifierType0 != null) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(classifierType0.getClassifier(), result, classifierType0.getParameters(), typeByTypeVar);
        }
        for (ClassifierType classifierType1 : ((ClassConcept) classifier).getImplementedInterfaces()) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(classifierType1.getClassifier(), result, classifierType1.getParameters(), typeByTypeVar);
        }
        if (classifier instanceof EnumClass) {
          SNode enumClassNode = JavaModelUtil_new.findClassifier("java.lang", "Enum", true);
          if (enumClassNode != null) {
            Classifier enumClassifier = (Classifier) enumClassNode.getAdapter();
            ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(enumClassifier, result, null, typeByTypeVar);
          }
        }
      } else
      if (classifier instanceof Interface) {
        for (ClassifierType classifierType : ((Interface) classifier).getExtendedInterfaces()) {
          ClassifierAndSuperClassifiersCache.ClassifiersDataSet.collectImplementedAndExtended(classifierType.getClassifier(), result, classifierType.getParameters(), typeByTypeVar);
        }
      }
    }
  }

  private static final class MethodsDataSet extends DataSet {
    public static final String ID = "METHODS_DATASET";

    private Map<String, List<BaseMethodDeclaration>> myMethodsByName;
    private Map<BaseMethodDeclaration, List<BaseMethodDeclaration>> myOverriddenMethods;
    private Set<SNode> myDependsOnNodes;

    public MethodsDataSet(AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_DATA_SET);
    }

    public List<BaseMethodDeclaration> getMethods() {
      List<BaseMethodDeclaration> result = new ArrayList<BaseMethodDeclaration>();
      for (List<BaseMethodDeclaration> list : this.myMethodsByName.values()) {
        result.addAll(list);
      }
      return result;
    }

    public List<BaseMethodDeclaration> getOverriddenMethods(BaseMethodDeclaration method) {
      List<BaseMethodDeclaration> list = this.myOverriddenMethods.get(method);
      if (list != null) {
        return list;
      }
      return new ArrayList<BaseMethodDeclaration>();
    }

    @Nullable
    public List<BaseMethodDeclaration> getMethodsByName(String methodName) {
      if (methodName == null) {
        return this.myMethodsByName.get("");
      }
      return this.myMethodsByName.get(methodName);
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    protected void init() {
      List<BaseMethodDeclaration> allMethods = new ArrayList<BaseMethodDeclaration>();
      List<Classifier> classifiers = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getClassifiers();
      for (Classifier classifier : classifiers) {
        allMethods.addAll(classifier.getMethods());
        if (classifier instanceof ClassConcept) {
          allMethods.addAll(((ClassConcept) classifier).getStaticMethods());
        }
      }
      this.myMethodsByName = new HashMap<String, List<BaseMethodDeclaration>>();
      this.myOverriddenMethods = new HashMap<BaseMethodDeclaration, List<BaseMethodDeclaration>>();
forEachInAllMethods:
      for (BaseMethodDeclaration currMethod : allMethods) {
        if (currMethod instanceof PlaceholderMethodDeclaration) {
          continue;
        }
        String name = currMethod.getName();
        if (name == null) {
          name = "";
        }
        if (!(this.myMethodsByName.containsKey(name))) {
          List<BaseMethodDeclaration> methods = new ArrayList<BaseMethodDeclaration>(3);
          methods.add(currMethod);
          this.myMethodsByName.put(name, methods);
          this.myOverriddenMethods.put(currMethod, new ArrayList<BaseMethodDeclaration>(3));
        } else {
          int currMethodParmCount = currMethod.getParametersCount();
          List<BaseMethodDeclaration> equalParmCountMethods = new ArrayList<BaseMethodDeclaration>(3);
          List<BaseMethodDeclaration> methods = this.myMethodsByName.get(name);
          for (BaseMethodDeclaration method : methods) {
            if ((currMethod.getParent().getNode() != method.getParent().getNode()) && method.getParametersCount() == currMethodParmCount) {
              equalParmCountMethods.add(method);
            }
          }
          if (equalParmCountMethods.size() > 0) {
            if (currMethodParmCount == 0) {
              this.myOverriddenMethods.get(equalParmCountMethods.get(0)).add(currMethod);
              continue forEachInAllMethods;
            }
            Map<TypeVariableDeclaration, Type> typeByTypeVar = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getTypeByTypeVariableMap();
            String currentParms = this.createMethodParameterTypesString(currMethod, typeByTypeVar);
            for (BaseMethodDeclaration otherMethod : equalParmCountMethods) {
              String otherParms = this.createMethodParameterTypesString(otherMethod, typeByTypeVar);
              if (otherParms.equals(currentParms)) {
                this.myOverriddenMethods.get(otherMethod).add(currMethod);
                continue forEachInAllMethods;
              }
            }
          }
          this.myMethodsByName.get(name).add(currMethod);
          this.myOverriddenMethods.put(currMethod, new ArrayList<BaseMethodDeclaration>(3));
        }
      }
      this.myDependsOnNodes = new HashSet<SNode>();
      for (Classifier classifier : classifiers) {
        this.myDependsOnNodes.add(classifier.getNode());
      }
      for (BaseMethodDeclaration method : allMethods) {
        this.myDependsOnNodes.add(method.getNode());
        for (ParameterDeclaration parm : method.getParameters()) {
          Type type = parm.getType();
          if (type == null) {
            continue;
          }
          this.myDependsOnNodes.add(type.getNode());
          this.myDependsOnNodes.addAll(type.getNode().getDescendants());
        }
      }
    }

    private String createMethodParameterTypesString(BaseMethodDeclaration method, Map<TypeVariableDeclaration, Type> typeByTypeVar) {
      StringBuilder result = new StringBuilder();
      for (ParameterDeclaration parm : method.getParameters()) {
        Type type = parm.getType();
        type = GenericTypesUtil.getTypeWithResolvedTypeVars(type, typeByTypeVar);
        if (result.length() > 0) {
          result.append(',');
        }
        if (type != null) {
          result.append(Type_Behavior.call_getErasureSignature_1213877337313(type.getNode()));
        } else {
          result.append("");
        }
      }
      return result.toString();
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        if (!((event.getChild().getAdapter() instanceof BaseMethodDeclaration))) {
          return;
        }
      }
      if (event.getParent().getAdapter() instanceof BaseMethodDeclaration) {
        String role = event.getChildRole();
        if (!(BaseMethodDeclaration.PARAMETER.equals(role))) {
          return;
        }
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        if (!((event.getChild().getAdapter() instanceof BaseMethodDeclaration))) {
          return;
        }
      }
      if (event.getParent().getAdapter() instanceof BaseMethodDeclaration) {
        String role = event.getChildRole();
        if (!(BaseMethodDeclaration.PARAMETER.equals(role))) {
          return;
        }
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
      if (BaseMethodDeclaration.NAME.equals(event.getPropertyName()) && event.getNode().getAdapter() instanceof BaseMethodDeclaration) {
        super.propertyChanged(event);
      }
    }
  }

  private static class FieldsDataSet extends DataSet {
    public static final String ID = "FIELDS_DATASET";

    private Map<String, FieldDeclaration> myFieldsByName;
    private Map<String, StaticFieldDeclaration> myStaticFieldsByName;
    private Set<SNode> myDependsOnNodes;

    public FieldsDataSet(AbstractCache ownerCache) {
      super(ID, ownerCache, DataSet.DefaultNodeChangedProcessing.DROP_DATA_SET);
    }

    public List<VariableDeclaration> getFields() {
      ArrayList<VariableDeclaration> result = new ArrayList<VariableDeclaration>(this.myFieldsByName.values());
      result.addAll(this.myStaticFieldsByName.values());
      return result;
    }

    public FieldDeclaration getFieldByName(String name) {
      if (name == null) {
        return this.myFieldsByName.get("");
      }
      return this.myFieldsByName.get(name);
    }

    public StaticFieldDeclaration getStaticFieldByName(String name) {
      if (name == null) {
        return this.myStaticFieldsByName.get("");
      }
      return this.myStaticFieldsByName.get(name);
    }

    public Set<SNode> getDependsOnNodes() {
      return this.myDependsOnNodes;
    }

    protected void init() {
      this.myFieldsByName = new HashMap<String, FieldDeclaration>();
      this.myStaticFieldsByName = new HashMap<String, StaticFieldDeclaration>();
      List<VariableDeclaration> allFields = new ArrayList<VariableDeclaration>();
      List<Classifier> classifiers = ((ClassifierAndSuperClassifiersCache) this.getOwnerCache()).getClassifiers();
      for (Classifier classifier : classifiers) {
        List<StaticFieldDeclaration> staticFields = classifier.getStaticFields();
        allFields.addAll(staticFields);
        for (StaticFieldDeclaration staticField : staticFields) {
          String name = staticField.getName();
          if (name == null) {
            name = "";
          }
          if (!(this.myStaticFieldsByName.containsKey(name))) {
            this.myStaticFieldsByName.put(name, staticField);
          }
        }
        if (classifier instanceof ClassConcept) {
          List<FieldDeclaration> fields = ((ClassConcept) classifier).getFields();
          allFields.addAll(fields);
          for (FieldDeclaration field : fields) {
            String name = field.getName();
            if (name == null) {
              name = "";
            }
            if (!(this.myFieldsByName.containsKey(name))) {
              this.myFieldsByName.put(name, field);
            }
          }
        }
      }
      this.myDependsOnNodes = new HashSet<SNode>();
      for (Classifier classifier : classifiers) {
        this.myDependsOnNodes.add(classifier.getNode());
      }
      for (VariableDeclaration field : allFields) {
        this.myDependsOnNodes.add(field.getNode());
      }
    }

    public void childAdded(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        BaseAdapter child = event.getChild().getAdapter();
        if (!((child instanceof FieldDeclaration || child instanceof StaticFieldDeclaration))) {
          return;
        }
      }
      if (event.getParent().getAdapter() instanceof VariableDeclaration) {
        return;
      }
      super.childAdded(event);
    }

    public void childRemoved(SModelChildEvent event) {
      if (event.getParent().getAdapter() instanceof Classifier) {
        BaseAdapter child = event.getChild().getAdapter();
        if (!((child instanceof FieldDeclaration || child instanceof StaticFieldDeclaration))) {
          return;
        }
      }
      if (event.getParent().getAdapter() instanceof VariableDeclaration) {
        return;
      }
      super.childRemoved(event);
    }

    public void propertyChanged(SModelPropertyEvent event) {
      BaseAdapter node = event.getNode().getAdapter();
      if (BaseVariableDeclaration.NAME.equals(event.getPropertyName()) && (node instanceof FieldDeclaration || node instanceof StaticFieldDeclaration)) {
        super.propertyChanged(event);
      }
    }
  }
}
