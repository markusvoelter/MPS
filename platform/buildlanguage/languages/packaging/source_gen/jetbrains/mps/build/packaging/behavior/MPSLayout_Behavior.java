package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import java.util.HashMap;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.io.File;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import java.util.LinkedList;
import jetbrains.mps.util.Macros;

public class MPSLayout_Behavior {
  public static void init(SNode thisNode) {
    Map<String, String> vars = MapSequence.fromMap(new HashMap<String, String>());
    MapSequence.fromMap(vars).put("basedir", "basedir");
    MapSequence.fromMap(vars).put("\\n", "line.separator");
    MapSequence.fromMap(vars).put("/", "file.separator");
    MapSequence.fromMap(vars).put(":", "path.separator");
    MapSequence.fromMap(vars).put("date", "DSTAMP");
    if (ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true)).isEmpty()) {
      SLinkOperations.addChild(thisNode, "configuration", SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Configuration", null));
    }
    SPropertyOperations.set(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "configuration", true)).first(), "name", "default");
    for (String s : SetSequence.fromSet(MapSequence.fromMap(vars).keySet())) {
      SNode var = SConceptOperations.createNewNode("jetbrains.mps.build.packaging.structure.Variable", null);
      SPropertyOperations.set(var, "name", s);
      SPropertyOperations.set(var, "antName", MapSequence.fromMap(vars).get(s));
      SLinkOperations.addChild(thisNode, "builtInVariable", var);
    }
  }

  public static String call_getFolderToGenerate_1229522949966(SNode thisNode) {
    String path = ILayoutComponent_Behavior.call_getPath_1213877230696(thisNode);
    if (path.endsWith(File.separator)) {
      path = path.substring(0, path.length() - 1);
    }
    if (StringUtils.isEmpty(SPropertyOperations.getString(thisNode, "scriptsFolder"))) {
      return path;
    }
    return path + File.separator + SPropertyOperations.getString(thisNode, "scriptsFolder");
  }

  public static String virtual_getPath_1213877230696(SNode thisNode) {
    String macro = IMacroHolder_Behavior.call_evaluateMacro_1234975967990(thisNode, SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "baseDirectory", true), "macro", true), "name"));
    String fullPathWithoutMacro = Path_Behavior.call_getFullPathWithoutMacro_1226511495568(SLinkOperations.getTarget(thisNode, "baseDirectory", true));
    if (StringUtils.isEmpty(macro)) {
      if (Sequence.fromIterable(Sequence.fromArray(File.listRoots())).contains(new File("/")) && !(fullPathWithoutMacro.startsWith("/"))) {
        fullPathWithoutMacro = "/" + fullPathWithoutMacro;
      }
      return fullPathWithoutMacro;
    } else {
      return macro + File.separator + fullPathWithoutMacro;
    }
  }

  public static List<SNode> call_getTopologicalSortedComponents_1213877228271(SNode thisNode) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode component : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true))) {
      MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(component, result);
    }
    return result;
  }

  public static List<SNode> call_getTopologicalSortedComponents_1213877228296(SNode thisNode, SNode config) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    List<SNode> all = MPSLayout_Behavior.call_getTopologicalSortedComponents_1213877228271(thisNode);
    for (SNode component : ListSequence.fromList(all)) {
      if (AbstractProjectComponent_Behavior.call_included_1213877333807(component, config)) {
        ListSequence.fromList(result).addElement(component);
        ListSequence.fromList(result).addSequence(ListSequence.fromList(AbstractProjectComponent_Behavior.call_getPostProcessingTasks_1213877333861(component)));
      }
    }
    return result;
  }

  public static List<SNode> call_getModules_1213877228340(SNode thisNode) {
    List<SNode> result = ListSequence.fromList(new ArrayList<SNode>());
    for (SNode component : ListSequence.fromList(SLinkOperations.getTargets(thisNode, "component", true))) {
      MPSLayout_Behavior.call_getModules_9027273598492143575(thisNode, result, component);
    }
    return result;
  }

  public static void call_getModules_9027273598492143575(SNode thisNode, List<SNode> modules, SNode component) {
    if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
      for (SNode child : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true))) {
        MPSLayout_Behavior.call_getModules_9027273598492143575(thisNode, modules, child);
      }
    } else
    if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.Module")) {
      ListSequence.fromList(modules).addElement(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.Module"));
    } else if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.BlockReference")) {
      for (SNode child : ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.BlockReference"), "block", false), "entry", true))) {
        MPSLayout_Behavior.call_getModules_9027273598492143575(thisNode, modules, child);
      }
    }
  }

  public static List<SNode> virtual_getAllVariable_1234864693585(SNode thisNode) {
    List<SNode> vars = ListSequence.fromList(new LinkedList<SNode>());
    ListSequence.fromList(vars).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "variable", true)));
    ListSequence.fromList(vars).addSequence(ListSequence.fromList(SLinkOperations.getTargets(thisNode, "builtInVariable", true)));
    return vars;
  }

  public static String call_getDefaultTargetName_1230209625713(SNode thisNode) {
    return "main";
  }

  public static String virtual_getPath_1234976932856(SNode thisNode) {
    return ILayoutComponent_Behavior.call_getPath_1213877230696(thisNode);
  }

  public static String getMPSHomeName_1226508944077() {
    return Macros.MPS_HOME.substring("${".length(), Macros.MPS_HOME.lastIndexOf("}"));
  }

  public static String getBasedirName_1226509010730() {
    return "basedir";
  }

  public static void proceesAbstractProjectComponent_1233317260545(SNode component, List<SNode> list) {
    if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent")) {
      for (SNode entry : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.ICompositeComponent"), "entry", true))) {
        MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(entry, list);
      }
    } else if (SNodeOperations.isInstanceOf(component, "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent")) {
      List<SNode> childrenToDo = ITransparentProjectComponent_Behavior.call_getChildrenToDo_1240564451382(SNodeOperations.cast(component, "jetbrains.mps.build.packaging.structure.ITransparentProjectComponent"));
      for (SNode child : ListSequence.fromList(childrenToDo)) {
        MPSLayout_Behavior.proceesAbstractProjectComponent_1233317260545(child, list);
      }
      return;
    }
    ListSequence.fromList(list).addElement(component);
  }
}
