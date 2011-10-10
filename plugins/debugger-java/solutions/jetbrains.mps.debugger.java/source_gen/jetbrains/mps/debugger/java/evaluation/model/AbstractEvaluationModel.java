package jetbrains.mps.debugger.java.evaluation.model;

/*Generated by MPS */

import jetbrains.mps.debug.runtime.JavaUiState;
import jetbrains.mps.debug.runtime.DebugSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.debug.evaluation.ui.EvaluationAuxModule;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import java.util.ArrayList;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.project.ModuleContext;
import jetbrains.mps.smodel.ProjectModels;
import jetbrains.mps.library.GeneralPurpose_DevKit;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelOperations;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.Computable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.project.IModule;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.ILeftCombinator;
import jetbrains.mps.debug.evaluation.Evaluator;
import jetbrains.mps.debug.evaluation.EvaluationException;
import java.util.Set;
import jetbrains.mps.reloading.IClassPathItem;
import java.util.HashSet;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.reloading.ClassPathFactory;
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import jetbrains.mps.ide.messages.DefaultMessageHandler;
import com.intellij.openapi.progress.util.ProgressWindow;
import jetbrains.mps.generator.GenerationFacade;
import java.util.Collections;
import jetbrains.mps.progress.ProgressMonitorAdapter;
import jetbrains.mps.generator.GenerationOptions;
import jetbrains.mps.generator.IncrementalGenerationStrategy;
import java.util.Map;
import jetbrains.mps.generator.GenerationCacheContainer;
import jetbrains.mps.generator.impl.dependencies.GenerationDependencies;
import com.intellij.openapi.util.Disposer;
import java.lang.reflect.InvocationTargetException;
import jetbrains.mps.debug.evaluation.InvocationTargetEvaluationException;
import jetbrains.mps.reloading.CompositeClassPathItem;
import jetbrains.mps.generator.GenerationStatus;
import jetbrains.mps.progress.ProgressMonitor;
import jetbrains.mps.debug.evaluation.transform.Transformator;

public abstract class AbstractEvaluationModel {
  private static final String EVALUATOR_NAME = "EvaluatorInstance";
  private static final boolean IS_DEVELOPER_MODE = false;

  protected JavaUiState myUiState;
  protected final DebugSession myDebugSession;
  protected final IOperationContext myContext;
  protected final EditableSModelDescriptor myAuxModel;
  protected final EvaluationAuxModule myAuxModule;
  private final List<Language> myLanguages = ListSequence.fromListAndArray(new LinkedList<Language>(), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.evaluation"), MPSModuleRepository.getInstance().getLanguage("jetbrains.mps.debug.privateMembers"));
  protected SNode myEvaluator;
  private final List<_FunctionTypes._void_P1_E0<? super SNode>> myGenerationListeners = ListSequence.fromList(new ArrayList<_FunctionTypes._void_P1_E0<? super SNode>>());
  protected final EvaluationContext myEvaluationContext;
  protected final boolean myShowContext;

  public AbstractEvaluationModel(Project project, @NotNull DebugSession session, @NotNull EvaluationAuxModule auxModule, EvaluationContext context, boolean isShowContext) {
    assert !(ApplicationManager.getApplication().isDispatchThread());
    myUiState = session.getUiState();
    myDebugSession = session;
    if (context.getLocationNode() != null) {
      myContext = ModuleContext.create(context.getLocationNode(), project);
    } else {
      myContext = new ModuleContext(auxModule, project);
    }
    myAuxModule = auxModule;

    final EditableSModelDescriptor modelDescriptor = ((EditableSModelDescriptor) ProjectModels.createDescriptorFor());
    modelDescriptor.getSModel().addDevKit(GeneralPurpose_DevKit.MODULE_REFERENCE);
    SModelRepository.getInstance().registerModelDescriptor(modelDescriptor, myAuxModule);

    myAuxModel = modelDescriptor;
    myEvaluationContext = context;
    myShowContext = isShowContext;
  }

  protected SModel getLocationModel() {
    return SNodeOperations.getModel(myEvaluationContext.getLocationNode());
  }

  public JavaUiState getUiState() {
    return this.myUiState;
  }

  public DebugSession getDebugSession() {
    return this.myDebugSession;
  }

  public EvaluationAuxModule getModule() {
    return myAuxModule;
  }

  public EditableSModelDescriptor getModel() {
    return myAuxModel;
  }

  public List<Language> getRequiredLanguages() {
    return myLanguages;
  }

  @NotNull
  public abstract SNode getRootToShow();

  @NotNull
  public abstract SNode getNodeToShow();

  public void createNodesToShow(final EditableSModelDescriptor model) {
    // todo do we need a separate method for that now? 
    // creating evaluator node 
    myEvaluator = createEvaluator(model);
    model.getSModel().addRoot(myEvaluator);
    SModelOperations.validateLanguagesAndImports(model.getSModel(), false, true);
  }

  protected SNode createEvaluator(SModelDescriptor model) {
    SNode node = SNodeFactoryOperations.createNewNode("jetbrains.mps.debug.evaluation.structure.EvaluatorConcept", null);
    SPropertyOperations.set(node, "isShowContext", "" + (myShowContext));
    return node;
  }

  public void addGenerationListener(_FunctionTypes._void_P1_E0<? super SNode> listener) {
    ListSequence.fromList(myGenerationListeners).addElement(listener);
  }

  public boolean isDeveloperMode() {
    return AbstractEvaluationModel.IS_DEVELOPER_MODE;
  }

  public void updateState() {
    myUiState = myDebugSession.getUiState();
    myEvaluationContext.setUiState(myUiState);
  }

  public EvaluationContext getEvaluationContext() {
    return myEvaluationContext;
  }

  public String getPresentation() {
    // todo better presentation 
    return ModelAccess.instance().runReadAction(new Computable<String>() {
      public String compute() {
        List<SNode> statements = SLinkOperations.getTargets(SLinkOperations.getTarget(myEvaluator, "evaluatedStatements", true), "statement", true);
        if (ListSequence.fromList(statements).isEmpty()) {
          return "empty statement";
        }
        SNode lastStatement = ListSequence.fromList(statements).last();
        String suffix = ((ListSequence.fromList(statements).count() > 1 ?
          "..." :
          ""
        ));
        if (SNodeOperations.isInstanceOf(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
          return getPresentation(SLinkOperations.getTarget(SNodeOperations.cast(lastStatement, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"), "expression", true)) + suffix;
        }
        return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(lastStatement, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class})) + suffix;
      }
    });
  }

  private String getPresentation(@Nullable SNode expression) {
    if (expression == null) {
      return "????";
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.lang.core.structure.INamedConcept")) {
      return SPropertyOperations.getString(SNodeOperations.cast(expression, "jetbrains.mps.lang.core.structure.INamedConcept"), "name");
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.DotExpression")) {
      return getPresentation(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)) + "." + getOperationPresentation(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.DotExpression"), "operation", true));
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) {
      return getPresentation(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "leftExpression", true)) + SConceptPropertyOperations.getString(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "alias") + getPresentation(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "rightExpression", true));
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.StringLiteral")) {
      return "\"" + SPropertyOperations.getString(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.StringLiteral"), "value") + "\"";
    }
    if (SNodeOperations.isInstanceOf(expression, "jetbrains.mps.baseLanguage.structure.GenericNewExpression")) {
      return "new " + ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(SLinkOperations.getTarget(SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.GenericNewExpression"), "creator", true), "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class}));
    }
    if (SConceptPropertyOperations.getBoolean(expression, "constant")) {
      return ((Object) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(expression, "jetbrains.mps.baseLanguage.structure.Expression"), "virtual_getCompileTimeConstantValue_1238860310638", new Class[]{SNode.class, IModule.class}, getModule())) + "";
    }
    return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(expression, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class}));
  }

  private String getOperationPresentation(@Nullable SNode operation) {
    if (operation == null) {
      return "????";
    }
    if (StringUtils.isNotEmpty(SConceptPropertyOperations.getString(operation, "alias"))) {
      return SConceptPropertyOperations.getString(operation, "alias");
    }
    if (SNodeOperations.isInstanceOf(operation, "jetbrains.mps.baseLanguage.structure.IMethodCall")) {
      return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(operation, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "baseMethodDeclaration", false), "name") + "(" + ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(operation, "jetbrains.mps.baseLanguage.structure.IMethodCall"), "actualArgument", true)).foldLeft("", new ILeftCombinator<SNode, String>() {
        public String combine(String s, SNode it) {
          return ((StringUtils.isEmpty(s) ?
            "" :
            s + ","
          )) + getPresentation(it);
        }
      }) + ")";
    }
    return ((String) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(operation, "jetbrains.mps.lang.core.structure.BaseConcept"), "virtual_getPresentation_1213877396640", new Class[]{SNode.class}));
  }

  @Nullable
  public Evaluator evaluate() throws EvaluationException {
    try {
      final Set<IClassPathItem> classpaths = new HashSet<IClassPathItem>();
      for (Language language : this.myLanguages) {
        IClassPathItem item = language.getClassPathItem();
        classpaths.add(item);
      }
      String path = PathManager.getHomePath() + NameUtil.pathFromNamespace(".lib.") + "tools.jar";
      classpaths.add(ClassPathFactory.getInstance().createFromPath(path, "AbstractEvaluationModel"));

      final String fullClassName = this.myAuxModel.getLongName() + "." + AbstractEvaluationModel.EVALUATOR_NAME;
      InMemoryJavaGenerationHandler handler = new AbstractEvaluationModel.MyInMemoryJavaGenerationHandler(false, true, classpaths);
      Project ideaProject = this.myAuxModule.getMPSProject().getProject();
      DefaultMessageHandler messageHandler = new DefaultMessageHandler(ideaProject);
      ProgressWindow progressWindow = new ProgressWindow(false, ideaProject);
      boolean successful = GenerationFacade.generateModels(myContext.getProject(), Collections.singletonList((SModelDescriptor) myAuxModel), myContext, handler, new ProgressMonitorAdapter(progressWindow), messageHandler, GenerationOptions.getDefaults().incremental(new IncrementalGenerationStrategy() {
        public Map<String, String> getModelHashes(SModelDescriptor p0, IOperationContext p1) {
          return Collections.emptyMap();
        }

        public GenerationCacheContainer getContainer() {
          return null;
        }

        public GenerationDependencies getDependencies(SModelDescriptor p0) {
          return null;
        }

        public boolean isIncrementalEnabled() {
          return false;
        }
      }).saveTransientModels(IS_DEVELOPER_MODE).rebuildAll(false).reporting(false, false, false, 0).create());

      Disposer.dispose(progressWindow);

      String source = handler.getSources().get(fullClassName);

      if (successful && StringUtils.isNotEmpty(source)) {
        if (isDeveloperMode()) {
          System.err.println(source);
        }
        ClassLoader parentClassLoader = this.myUiState.getClass().getClassLoader();
        Class clazz = Class.forName(fullClassName, true, handler.getCompiler().getClassLoader(parentClassLoader));
        Evaluator evaluator;
        try {
          evaluator = (Evaluator) clazz.getConstructor(JavaUiState.class).newInstance(this.myUiState);
        } catch (InvocationTargetException e) {
          // try again 
          myUiState = myDebugSession.refresh();
          evaluator = (Evaluator) clazz.getConstructor(JavaUiState.class).newInstance(this.myUiState);
        }
        return evaluator;
      } else if (StringUtils.isNotEmpty(source) && !(successful)) {
        throw new EvaluationException("Errors during compilation.");
      } else {
        throw new EvaluationException("Errors during generation.");
      }
    } catch (InvocationTargetException e) {
      // invocation target exceptions from newInstance method call via reflection 
      // second time, which means refresh did not help 
      // this is bad 
      // I personally think something should be done with all those exceptions 
      // other then hiding them from user 
      // but I do not know what 
      // TODO think 
      throw new InvocationTargetEvaluationException(e.getCause());
    } catch (EvaluationException e) {
      throw e;
    } catch (Throwable t) {
      throw new EvaluationException(t);
    }
  }

  public abstract AbstractEvaluationModel copy(boolean isShowContext);

  protected IModule getLocationModule() {
    return getLocationModel().getModelDescriptor().getModule();
  }

  public IOperationContext getContext() {
    return myContext;
  }

  private class MyInMemoryJavaGenerationHandler extends InMemoryJavaGenerationHandler {
    private final Set<IClassPathItem> myClasspaths;

    public MyInMemoryJavaGenerationHandler(boolean reloadClasses, boolean keepSources, Set<IClassPathItem> classpaths) {
      super(reloadClasses, keepSources);
      this.myClasspaths = classpaths;
    }

    @Override
    public boolean canHandle(SModelDescriptor inputModel) {
      return inputModel != null;
    }

    @Override
    protected CompositeClassPathItem getClassPath(Set<IModule> contextModules) {
      CompositeClassPathItem result = super.getClassPath(contextModules);
      for (IClassPathItem item : this.myClasspaths) {
        result.add(item);
      }
      return result;
    }

    @Override
    public boolean handleOutput(IModule module, SModelDescriptor inputModel, GenerationStatus status, IOperationContext context, ProgressMonitor monitor) {
      SModel model = status.getOutputModel();
      if (model != null) {
        final SNode evaluator = SModelOperations.getRootByName(model, AbstractEvaluationModel.EVALUATOR_NAME);

        if (evaluator != null) {
          try {
            new Transformator(evaluator, true).transformEvaluator();
            if (AbstractEvaluationModel.IS_DEVELOPER_MODE) {
              for (_FunctionTypes._void_P1_E0<? super SNode> listener : ListSequence.fromList(myGenerationListeners)) {
                listener.invoke(evaluator);
              }
            }
          } catch (Throwable t) {
            LOG.error(t);
          }

        }
      }
      return super.handleOutput(module, inputModel, status, context, monitor);
    }
  }
}
