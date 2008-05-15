package jetbrains.mps.intentions;

import jetbrains.mps.bootstrap.intentionsLanguage.constraints.IntentionDeclaration_Behavior;
import jetbrains.mps.bootstrap.intentionsLanguage.structure.IntentionDeclaration;
import jetbrains.mps.components.IExternalizableComponent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.IEditorMessage;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.util.Calculable;
import jetbrains.mps.ide.command.CommandProcessor;
import jetbrains.mps.component.IComponentLifecycle;
import jetbrains.mps.component.Dependency;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.reloading.ReloadListener;
import jetbrains.mps.reloading.ReloadAdapter;
import org.jdom.Element;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ApplicationComponent;

public class IntentionsManager implements IExternalizableComponent, IComponentLifecycle, ApplicationComponent {
  private static final String VERSION = "version";
  private static final String ID = "id";
  private static final String VERSION_NUMBER = "0.1";
  private static final String DISABLED_INTENTIONS = "disables_intentions";
  private static final String INTENTION = "intention";
  private static final String CLASS_NAME = "class_name";

  private static final Logger LOG = Logger.getLogger(IntentionsManager.class);

  public static IntentionsManager getInstance() {
    return ApplicationManager.getApplication().getComponent(IntentionsManager.class);
  }

  private Map<Intention, SNode> myNodesByIntentions = new HashMap<Intention, SNode>();
  private Map<String, Set<Intention>> myIntentions = new HashMap<String, Set<Intention>>();
  private Set<String> myDisabledIntentionsClassNames = new HashSet<String>();
  private Set<Intention> myDisabledIntentionsCache = new HashSet<Intention>();
  private HashMap<Class, Language> myIntentionsLanguages = new HashMap<Class, Language>();
  private boolean myCachesAreValid = false;

  private ClassLoaderManager myClassLoaderManager;

  public IntentionsManager(ClassLoaderManager manager) {
    myClassLoaderManager = manager;
  }

  public void initComponent() {
    myClassLoaderManager.addReloadHandler(new ReloadAdapter() {
      public void onReload() {
        refresh();
      }
    });
  }

  @NonNls
  @NotNull
  public String getComponentName() {
    return "MPS Intention Manager";
  }

  public void disposeComponent() {
  }

  public Set<Intention> getAvailableIntentions(final SNode node, final EditorContext context) {
    Set<Intention> result = new HashSet<Intention>();

    assert (context != null);

    for (String conceptFQName : myIntentions.keySet()) {
      if (node.isInstanceOfConcept(conceptFQName)) {
        for (final Intention intention : Collections.unmodifiableSet(myIntentions.get(conceptFQName))) {
          try {
            boolean isApplicable = CommandProcessor.instance().executeLightweightCommand(new Calculable<Boolean>() {
              public Boolean calculate() {
                return intention.isApplicable(node, context);
              }
            });
            if (isApplicable) {
              result.add(intention);
            }
          } catch (Throwable t) {
            LOG.error("Intention's isApplicable method failed " + t.getMessage(), t);
          }
        }
      }
    }
    List<IEditorMessage> messages = context.getNodeEditorComponent().getHighlightManager().getMessagesFor(node);
    for (IEditorMessage message : messages) {
      IntentionProvider intentionProvider = message.getIntentionProvider();
      if (intentionProvider != null) {
        Intention intention = intentionProvider.getIntention(node, context);
        if (intention != null) {
          result.add(intention);
        }
      }
    }
    return Collections.unmodifiableSet(result);
  }

  public Set<Intention> getEnabledAvailableIntentions(SNode node, EditorContext context) {
    Set<Intention> result = new HashSet<Intention>(getAvailableIntentions(node, context));
    result.removeAll(getDisabledIntentions());
    return result;
  }

  public Set<Intention> getDisabledAvailableIntentions(SNode node, EditorContext context) {
    Set<Intention> result = new HashSet<Intention>(getAvailableIntentions(node, context));
    result.retainAll(getDisabledIntentions());
    return result;
  }

  protected Set<Intention> getDisabledIntentions() {
    if (!myCachesAreValid) {
      myDisabledIntentionsCache.clear();
      for (Set<Intention> conceptIntentions : myIntentions.values()) {
        for (Intention intention : conceptIntentions) {
          if (myDisabledIntentionsClassNames.contains(intention.getClass().getName())) {
            myDisabledIntentionsCache.add(intention);
          }
        }
      }
      myCachesAreValid = true;
    }
    return myDisabledIntentionsCache;
  }

  protected void invalidateCaches() {
    myCachesAreValid = false;
  }

  public boolean intentionIsDisabled(Intention intention) {
    return getDisabledIntentions().contains(intention);
  }

  public void invertIntentionState(Intention intention) {
    setIntentionState(intention, !intentionIsDisabled(intention));
  }

  public void setIntentionState(Intention intention, boolean disabled) {
    if (disabled) {
      disableIntention(intention);
    } else {
      enableIntention(intention);
    }
  }

  public void disableIntention(Intention intention) {
    myDisabledIntentionsClassNames.add(intention.getClass().getName());
    myDisabledIntentionsCache.add(intention);
  }

  public void enableIntention(Intention intention) {
    myDisabledIntentionsClassNames.remove(intention.getClass().getName());
    myDisabledIntentionsCache.remove(intention);
  }

  public Language getIntentionLanguage(Intention intention) {
    return myIntentionsLanguages.get(intention.getClass());
  }

  public void refresh() {
    myIntentions.clear();
    myNodesByIntentions.clear();
    myIntentionsLanguages.clear();
    invalidateCaches();
    for (Language l : MPSModuleRepository.getInstance().getAllLanguages()) {
      SModelDescriptor intentionsModelDescriptor = l.getIntentionsModelDescriptor();
      if (intentionsModelDescriptor != null) {
        SModel smodel = intentionsModelDescriptor.getSModel();
        for (IntentionDeclaration intentionDeclaration : smodel.getRootsAdapters(IntentionDeclaration.class)) {
          String className = smodel.getUID().getLongName() + "." + IntentionDeclaration_Behavior.call_getGeneratedName_1193141280918(intentionDeclaration.getNode());
          String conceptName = IntentionDeclaration_Behavior.call_getConceptName_1193142194523(intentionDeclaration.getNode());
          try {
            Class<?> cls = l.getClass(className);

            if (cls != null) {
              Object intention = cls.newInstance();
              Set<Intention> intentions = myIntentions.get(conceptName);
              if (intentions == null) {
                intentions = new HashSet<Intention>();
              }
              intentions.add((Intention) intention);
              myIntentions.put(conceptName, intentions);
              myNodesByIntentions.put((Intention) intention, intentionDeclaration.getNode());
              myIntentionsLanguages.put(cls, l);
            } else {
              LOG.warning("Intention is registered but isn't compiled " + NameUtil.nodeFQName(intentionDeclaration), intentionDeclaration);
            }
          } catch (Throwable throwable) {
            LOG.error(throwable, intentionDeclaration);
          }
        }
      }
    }
  }

  public void read(Element element, MPSProject project) {
    myDisabledIntentionsClassNames.clear();
    invalidateCaches();
    Element versionXML = element.getChild(VERSION);
    if (versionXML == null) return;
    String version = versionXML.getAttribute(ID).getValue();
    if (!VERSION_NUMBER.equals(version)) return;

    Element disabledXML = element.getChild(DISABLED_INTENTIONS);
    for (Element intentionXML : (List<Element>) disabledXML.getChildren(INTENTION)) {
      String className = intentionXML.getAttribute(CLASS_NAME).getValue();
      myDisabledIntentionsClassNames.add(className);
    }
  }

  public void write(Element element, MPSProject project) {
    Element versionXML = new Element(VERSION);
    versionXML.setAttribute(ID, VERSION_NUMBER);
    element.addContent(versionXML);

    Element disabledXML = new Element(DISABLED_INTENTIONS);
    for (String intentionName : myDisabledIntentionsClassNames) {
      Element intentionXML = new Element(INTENTION);
      intentionXML.setAttribute(CLASS_NAME, intentionName);
      disabledXML.addContent(intentionXML);
    }
    element.addContent(disabledXML);
  }

  @Nullable
  public SNode getNodeByIntention(Intention intention) {
    return myNodesByIntentions.get(intention);
  }
}
