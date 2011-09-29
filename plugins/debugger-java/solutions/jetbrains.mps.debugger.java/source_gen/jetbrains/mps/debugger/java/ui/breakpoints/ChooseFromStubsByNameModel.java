package jetbrains.mps.debugger.java.ui.breakpoints;

/*Generated by MPS */

import com.intellij.ide.util.gotoByName.ChooseByNameModel;
import java.util.Map;
import java.util.List;
import jetbrains.mps.workbench.actions.goTo.index.descriptor.BaseSNodeDescriptor;
import java.util.LinkedHashMap;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.workbench.actions.goTo.index.StubsNodeDescriptorsCache;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.generator.JavaModelUtil_new;
import jetbrains.mps.smodel.SModelReference;
import javax.swing.ListCellRenderer;
import com.intellij.ide.ui.ListCellRendererWrapper;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import org.jetbrains.annotations.NotNull;

/*package*/ abstract class ChooseFromStubsByNameModel implements ChooseByNameModel {
  private final Map<String, List<BaseSNodeDescriptor>> myPossibleNodes = new LinkedHashMap<String, List<BaseSNodeDescriptor>>();

  /*package*/ ChooseFromStubsByNameModel() {
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        for (IModule m : GlobalScope.getInstance().getVisibleModules()) {
          boolean hasStubs = false;
          for (SModelDescriptor sd : m.getOwnModelDescriptors()) {
            if (SModelStereotype.isStubModelStereotype(sd.getStereotype())) {
              hasStubs = true;
              break;
            }
          }
          if (!(hasStubs)) {
            continue;
          }
          List<BaseSNodeDescriptor> descriptors = ListSequence.fromList(new ArrayList<BaseSNodeDescriptor>());
          for (SModelDescriptor model : ListSequence.fromList(m.getOwnModelDescriptors())) {
            ListSequence.fromList(descriptors).addSequence(ListSequence.fromList(StubsNodeDescriptorsCache.getInstance().getSNodeDescriptors(model.getSModelReference())));
          }
          for (BaseSNodeDescriptor descriptor : descriptors) {
            String name = getName(descriptor);
            List<BaseSNodeDescriptor> descriptorList = myPossibleNodes.get(name);
            if (descriptorList == null) {
              descriptorList = new ArrayList<BaseSNodeDescriptor>();
              myPossibleNodes.put(name, descriptorList);
            }
            descriptorList.add(descriptor);
          }
        }
      }
    });
  }

  protected abstract boolean isValid(SNode node);

  private boolean isValidClassifier(final BaseSNodeDescriptor descriptor) {
    final Wrappers._boolean result = new Wrappers._boolean();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        SNode classifier = JavaModelUtil_new.findClassifier(getNamespace(descriptor), getName(descriptor), true);
        result.value = (classifier != null) && isValid(classifier);
      }
    });
    return result.value;
  }

  private String getName(BaseSNodeDescriptor descriptor) {
    return descriptor.getNodeName();
  }

  private String getNamespace(BaseSNodeDescriptor descriptor) {
    SModelReference modelReference = descriptor.getModelReference();
    if (modelReference != null) {
      return modelReference.getLongName();
    }
    return null;
  }

  @Override
  public String getPromptText() {
    return null;
  }

  @Override
  public String getNotInMessage() {
    return null;
  }

  @Override
  public String getNotFoundMessage() {
    return null;
  }

  @Override
  public String getCheckBoxName() {
    return null;
  }

  @Override
  public char getCheckBoxMnemonic() {
    return 0;
  }

  @Override
  public boolean loadInitialCheckBoxState() {
    return false;
  }

  @Override
  public void saveInitialCheckBoxState(boolean state) {
  }

  @Override
  public ListCellRenderer getListCellRenderer() {
    ListCellRendererWrapper wrapper = new ListCellRendererWrapper<Object>(new DefaultListCellRenderer()) {
      @Override
      public void customize(JList list, Object value, int index, boolean selected, boolean hasFocus) {
        if (value != null && value instanceof BaseSNodeDescriptor) {
          String fullName = getFullName(value);
          if (fullName != null) {
            setText(fullName);
          }
        }
      }
    };
    return wrapper;
  }

  @Override
  public String[] getNames(boolean checkBoxState) {
    return myPossibleNodes.keySet().toArray(new String[myPossibleNodes.size()]);
  }

  @Override
  public Object[] getElementsByName(String name, boolean checkBoxState, String pattern) {
    List<BaseSNodeDescriptor> descriptors = new ArrayList<BaseSNodeDescriptor>();
    for (BaseSNodeDescriptor descriptor : myPossibleNodes.get(name)) {
      String descriptorName = getElementName(descriptor);
      if (descriptorName != null && descriptorName.equals(name) && isValidClassifier(descriptor)) {
        descriptors.add(descriptor);
      }
    }
    return descriptors.toArray(new BaseSNodeDescriptor[descriptors.size()]);
  }

  @Override
  public String getElementName(Object element) {
    return getName((BaseSNodeDescriptor) element);
  }

  @NotNull
  @Override
  public String[] getSeparators() {
    return new String[]{"."};
  }

  @Override
  public String getFullName(Object element) {
    String name = getName((BaseSNodeDescriptor) element);
    String namespace = getNamespace((BaseSNodeDescriptor) element);
    if (namespace == null) {
      return name;
    }
    return namespace + "." + name;
  }

  @Override
  public String getHelpId() {
    return null;
  }
}
