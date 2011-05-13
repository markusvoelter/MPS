package jetbrains.mps.vcs.mergedriver;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.io.IOException;
import com.intellij.openapi.vcs.VcsRoot;
import com.intellij.openapi.project.Project;
import jetbrains.mps.internal.collections.runtime.Sequence;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import com.intellij.openapi.ui.Messages;
import jetbrains.mps.util.NameUtil;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class GitRepositoriesInstaller {
  private static final String ATTRIBUTES_FILE = ".gitattributes";
  private static final List<String> EXTENSIONS = ListSequence.fromListAndArray(new ArrayList<String>(), "mps");

  private GitRepositoriesInstaller() {
  }

  private static boolean install(VirtualFile vcsRootPath, boolean dryRun) {
    VirtualFile attributesFile = vcsRootPath.findChild(ATTRIBUTES_FILE);
    if (attributesFile != null && attributesFile.isDirectory()) {
      return false;
    }
    try {
      if (attributesFile == null || attributesFile.exists()) {
        attributesFile = vcsRootPath.createChildData(null, ATTRIBUTES_FILE);
      }
      final List<String> lines = StringsIO.readLines(attributesFile.getInputStream());

      if (dryRun) {
        return ListSequence.fromList(EXTENSIONS).all(new IWhereFilter<String>() {
          public boolean accept(final String ext) {
            return ListSequence.fromList(lines).any(new IWhereFilter<String>() {
              public boolean accept(String line) {
                return line.matches("\\s*\\*\\." + ext + ".+merge=mps\\s*");
              }
            });
          }
        });
      }

      for (String ext : ListSequence.fromList(EXTENSIONS)) {
        boolean updated = false;
        for (int i = 0; i < ListSequence.fromList(lines).count(); i++) {
          if (ListSequence.fromList(lines).getElement(i).matches("\\s*\\*\\." + ext + ".*") && !(ListSequence.fromList(lines).getElement(i).contains("merge=mps"))) {
            ListSequence.fromList(lines).setElement(i, ListSequence.fromList(lines).getElement(i) + " merge=mps");
            updated = true;
          }
        }
        if (!(updated)) {
          ListSequence.fromList(lines).addElement("*." + ext + " merge=mps");
        }
      }

      StringsIO.writeLines(attributesFile.getOutputStream(null), lines);
      return true;
    } catch (IOException e) {
      return false;
    }
  }

  private static boolean isInstalled(VirtualFile path) {
    return install(path, true);
  }

  private static void install(VirtualFile path) {
    install(path, false);
  }

  public static Iterable<VcsRoot> getRepositoriesToInstall(Project project) {
    return Sequence.fromIterable(Sequence.fromArray(project.getComponent(ProjectLevelVcsManager.class).getAllVcsRoots())).where(new IWhereFilter<VcsRoot>() {
      public boolean accept(VcsRoot root) {
        return "Git".equals(root.vcs.getName()) && !(isInstalled(root.path));
      }
    });
  }

  public static void installForRepositories(Project project) {
    Iterable<VcsRoot> roots = getRepositoriesToInstall(project);
    assert Sequence.fromIterable(roots).isNotEmpty();
    Sequence.fromIterable(roots).visitAll(new IVisitor<VcsRoot>() {
      public void visit(VcsRoot root) {
        install(root.path);
      }
    });
    Messages.showInfoMessage(project, "Successfully updated attributes for " + roots, "Attributes");
  }

  public static void installForRepositoriesIfNeeded(Project project, String globalMessage) {
    if (Sequence.fromIterable(getRepositoriesToInstall(project)).isEmpty()) {
      Messages.showInfoMessage(project, globalMessage, "Merge Driver");
    } else {
      Iterable<VcsRoot> rootsToUpdate = getRepositoriesToInstall(project);
      String repositories = NameUtil.formatNumericalString(Sequence.fromIterable(rootsToUpdate).count(), "Git repository");
      int answer = Messages.showYesNoDialog(project, globalMessage + "\nDo you want to to update MPS files attributes in the following Git repositories?\n" + StringUtils.join(Sequence.fromIterable(rootsToUpdate).<String>select(new ISelector<VcsRoot, String>() {
        public String select(VcsRoot r) {
          return r.path.getPath();
        }
      }).toListSequence(), "\n"), "Update Git " + ((Sequence.fromIterable(rootsToUpdate).count() == 1 ?
        "Repository" :
        "Repositories"
      )), null);

      if (answer == 0) {
        installForRepositories(project);
        Messages.showInfoMessage(project, "Successfully updated attributes for " + repositories, "Attributes");
      }
    }
  }
}
