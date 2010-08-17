package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.List;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.MPSModuleRepository;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.BoxLayout;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JList;

public class LanguagePaths_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(LanguagePaths_Action.class);

  public LanguagePaths_Action() {
    super("Analyze Langugages' Paths", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "LanguagePaths", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      List<Language> languages = MPSModuleRepository.getInstance().getAllLanguages();
      JDialog dialog = new JDialog();
      JPanel mainp = new JPanel();
      JScrollPane sp = new JScrollPane(mainp, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      dialog.add(sp);
      mainp.setLayout(new BoxLayout(mainp, BoxLayout.Y_AXIS));
      for (Language lang : ListSequence.fromList(languages)) {
        List<StubModelsEntry> cp = StubModelsEntry.filterJava(lang.getModuleDescriptor().getStubModelEntries());
        List<StubModelsEntry> rcp = StubModelsEntry.filterJava(lang.getModuleDescriptor().getRuntimeStubModels());

        List<String> cpu = new ArrayList();
        for (StubModelsEntry i : ListSequence.fromList(cp)) {
          cpu.add(i.getPath());
        }
        for (StubModelsEntry i : ListSequence.fromList(rcp)) {
          cpu.remove(i.getPath());
        }

        List<String> rcpu = new ArrayList();
        for (StubModelsEntry i : ListSequence.fromList(rcp)) {
          rcpu.add(i.getPath());
        }
        for (StubModelsEntry i : ListSequence.fromList(cp)) {
          rcpu.remove(i.getPath());
        }

        if (cpu.isEmpty() && rcpu.isEmpty()) {
          continue;
        }

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createTitledBorder(lang.getModuleFqName()));
        mainp.add(panel);
        JList list1 = new JList(cpu.toArray());
        JList list2 = new JList(rcpu.toArray());
        panel.add(list1, BorderLayout.WEST);
        panel.add(list2, BorderLayout.EAST);
      }
      dialog.setVisible(true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "LanguagePaths", t);
      }
    }
  }
}
