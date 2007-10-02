package jetbrains.mps.smodel;

import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelRepository;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.refactoring.framework.ILoggableRefactoring;
import jetbrains.mps.refactoring.framework.MarshallUtil;
import jetbrains.mps.refactoring.framework.RefactoringLoggingFailedException;
import jetbrains.mps.logging.refactoring.structure.*;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: Cyril.Konopko
 * Date: 28.09.2007
 * Time: 17:55:17
 * To change this template use File | Settings | File Templates.
 */
public class GenericRefactoring {
  private ILoggableRefactoring myRefactoring;

  public GenericRefactoring(ILoggableRefactoring refactoring) {
    myRefactoring = refactoring;
  }

  public void execute(@NotNull ActionContext context) {
    Map<String, String> args = myRefactoring.askForInfo(context);
    if (args == null) return;
    myRefactoring.doRefactor(context, args);
    SModelDescriptor modelDescriptor = context.getModel();
    if (modelDescriptor == null) return;
    SModel model = modelDescriptor.getSModel();
    writeIntoLog(model, args);
    for (SModelDescriptor anotherDescriptor : SModelRepository.getInstance().getAllModelDescriptors()) {
      String stereotype = anotherDescriptor.getStereotype();
      if (!stereotype.equals(SModelStereotype.NONE) && !stereotype.equals(SModelStereotype.TEMPLATES)) {
        continue;
      }
      if (!anotherDescriptor.isInitialized()) continue;
      SModel anotherModel = anotherDescriptor.getSModel();
      if (model != anotherModel && !anotherModel.getImportedModelUIDs().contains(model.getUID())) continue;
      processModel(anotherModel, model, args);
    }

  }

  private void processModel(SModel model, SModel usedModel, Map<String, String> args) {
    myRefactoring.updateModel(model, args);
    model.updateImportedModelUsedVersion(usedModel.getUID(), usedModel.getVersion());
    SModelRepository.getInstance().markChanged(model, true);
  }

  private void writeIntoLog(SModel model, Map<String, String> args) {
    String nodeIdString = myRefactoring.getSourceId();
    String modelUID = MarshallUtil.getModelUID(nodeIdString);
    String nodeId = MarshallUtil.getNodeId(nodeIdString);

    SModelDescriptor modelDescriptor = SModelRepository.getInstance().getModelDescriptor(SModelUID.fromString(modelUID));
    if (modelDescriptor == null) {
      throw new RefactoringLoggingFailedException("refactoring source model could not be found, UID="+modelUID);
    }

    SNode refactoringSourceNode = modelDescriptor.getSModel().getNodeById(nodeId);
    if (refactoringSourceNode == null) {
      throw new RefactoringLoggingFailedException("refactoring source node could not be found, id="+nodeId);
    }
    if (!BaseAdapter.isInstance(refactoringSourceNode, Refactoring.class)) {
      throw new RefactoringLoggingFailedException("refactoring source node is not a refactoring source, id="+nodeId);
    }

    SNode nodeToBeLogged = CopyUtil.copy(refactoringSourceNode, model);
    Refactoring refactoring = (Refactoring) nodeToBeLogged.getAdapter();
    RuntimeLog refactoringLog = RuntimeLog.newInstance(model);
    UpdateModelClause updateModelClause = refactoring.getUpdateModelClause();
    updateModelClause.getParent().removeChild(updateModelClause);
    refactoringLog.setUpdateModelClause(updateModelClause);
    for (String name : args.keySet()) {
      RequiredAdditionalArgument argument = findArgumentByName(refactoring, name);
      if (argument == null) continue;
      RequiredAdditionalArgumentValue value = RequiredAdditionalArgumentValue.newInstance(model);
      refactoringLog.addArgumentValue(value);
      value.setValue(args.get(name));
      argument.getParent().removeChild(argument);
      value.setArgument(argument);
    }

    SNode log = model.getLog();
    RuntimeLogStack runtimeLogStack;
    if (log == null) {
      runtimeLogStack = RuntimeLogStack.newInstance(model);
      model.setLog(runtimeLogStack.getNode());
    } else {
      runtimeLogStack = (RuntimeLogStack) log.getAdapter();
    }

    runtimeLogStack.addLog(refactoringLog);
    model.increaseVersion();
    refactoringLog.setModelVersion(model.getVersion());
  }

  private RequiredAdditionalArgument findArgumentByName(Refactoring refactoring, String name) {
    for (RequiredAdditionalArgument argument : refactoring.getArgumentses()) {
      if (name.equals(argument.getName())) {
        return argument;
      }
    }
    for (RequiredAdditionalArgument argument : refactoring.getInternalArgumentses()) {
       if (name.equals(argument.getName())) {
        return argument;
      }
    }
    return null;
  }
}
