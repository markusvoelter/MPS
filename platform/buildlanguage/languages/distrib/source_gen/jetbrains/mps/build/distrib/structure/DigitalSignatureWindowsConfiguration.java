package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.build.packaging.structure.IPath;
import java.util.Iterator;
import jetbrains.mps.build.distrib.structure.AbstractCommandLinePart;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DigitalSignatureWindowsConfiguration extends BaseConcept {
  public static final String concept = "jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration";
  public static final String PATH_TO_EXECUTABLE = "pathToExecutable";
  public static final String COMMAND_LINE = "commandLine";

  public DigitalSignatureWindowsConfiguration(SNode node) {
    super(node);
  }

  public IPath getPathToExecutable() {
    return (IPath)this.getChild(IPath.class, DigitalSignatureWindowsConfiguration.PATH_TO_EXECUTABLE);
  }

  public void setPathToExecutable(IPath node) {
    super.setChild(DigitalSignatureWindowsConfiguration.PATH_TO_EXECUTABLE, node);
  }

  public int getCommandLinesCount() {
    return this.getChildCount(DigitalSignatureWindowsConfiguration.COMMAND_LINE);
  }

  public Iterator<AbstractCommandLinePart> commandLines() {
    return this.children(AbstractCommandLinePart.class, DigitalSignatureWindowsConfiguration.COMMAND_LINE);
  }

  public List<AbstractCommandLinePart> getCommandLines() {
    return this.getChildren(AbstractCommandLinePart.class, DigitalSignatureWindowsConfiguration.COMMAND_LINE);
  }

  public void addCommandLine(AbstractCommandLinePart node) {
    this.addChild(DigitalSignatureWindowsConfiguration.COMMAND_LINE, node);
  }

  public void insertCommandLine(AbstractCommandLinePart prev, AbstractCommandLinePart node) {
    this.insertChild(prev, DigitalSignatureWindowsConfiguration.COMMAND_LINE, node);
  }


  public static DigitalSignatureWindowsConfiguration newInstance(SModel sm, boolean init) {
    return (DigitalSignatureWindowsConfiguration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DigitalSignatureWindowsConfiguration newInstance(SModel sm) {
    return DigitalSignatureWindowsConfiguration.newInstance(sm, false);
  }

}
