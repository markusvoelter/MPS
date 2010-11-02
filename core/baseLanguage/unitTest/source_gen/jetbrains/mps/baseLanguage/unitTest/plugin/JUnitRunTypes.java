package jetbrains.mps.baseLanguage.unitTest.plugin;

/*Generated by MPS */

import jetbrains.mps.project.MPSProject;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.ISequenceClosure;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.closures.runtime.YieldingIterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.project.IModule;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.ide.DataManager;

public enum JUnitRunTypes {
  METHOD() {

    public Iterable<ITestNodeWrapper> collect(final DefaultJUnit_Configuration configuration, MPSProject project) {
      Iterable<ITestNodeWrapper> methods = Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
      if (configuration.getStateObject().fullMethodNames != null) {
        // legacy code here, fullMethodNames should be removed 
        // TODO remove fullMethodNames after 2.0 
        methods = Sequence.fromClosure(new ISequenceClosure<ITestNodeWrapper>() {
          public Iterable<ITestNodeWrapper> iterable() {
            return new Iterable<ITestNodeWrapper>() {
              public Iterator<ITestNodeWrapper> iterator() {
                return new YieldingIterator<ITestNodeWrapper>() {
                  private int __CP__ = 0;
                  private String _2_methodName;
                  private Iterator<String> _2_methodName_it;
                  private ITestNodeWrapper _6_method;

                  protected boolean moveToNext() {
__loop__:
                    do {
__switch__:
                      switch (this.__CP__) {
                        case -1:
                          assert false : "Internal error";
                          return false;
                        case 2:
                          this._2_methodName_it = ListSequence.fromList(configuration.getStateObject().fullMethodNames).iterator();
                        case 3:
                          if (!(this._2_methodName_it.hasNext())) {
                            this.__CP__ = 1;
                            break;
                          }
                          this._2_methodName = this._2_methodName_it.next();
                          this.__CP__ = 4;
                          break;
                        case 7:
                          if (_6_method == null) {
                            this.__CP__ = 8;
                            break;
                          }
                          this.__CP__ = 9;
                          break;
                        case 9:
                          this.__CP__ = 3;
                          this.yield(_6_method);
                          return true;
                        case 0:
                          this.__CP__ = 2;
                          break;
                        case 4:
                          this._6_method = TestUtils.getTestMethod(_2_methodName);
                          this.__CP__ = 7;
                          break;
                        case 8:
                          this.__CP__ = 3;
                          break;
                        default:
                          break __loop__;
                      }
                    } while (true);
                    return false;
                  }
                };
              }
            };
          }
        });
      }
      return Sequence.fromIterable(methods).union(Sequence.fromIterable(TestUtils.wrapPointerStrings(configuration.getStateObject().testMethods)));
    }

    public String check(DefaultJUnit_Configuration configuration) {
      if ((configuration.getStateObject().fullMethodNames == null || configuration.getStateObject().fullMethodNames.isEmpty()) && (configuration.getStateObject().testMethods == null || configuration.getStateObject().testMethods.isEmpty())) {
        return "Methods list is empty.";
      }
      if (configuration.getStateObject().fullMethodNames != null) {
        for (String fullMethodName : ListSequence.fromList(configuration.getStateObject().fullMethodNames)) {
          if (TestUtils.getTestMethod(fullMethodName) == null) {
            return "Could not find method " + fullMethodName + ".";
          }
        }
      }
      if (configuration.getStateObject().testMethods != null) {
        for (String method : ListSequence.fromList(configuration.getStateObject().testMethods)) {
          SNodePointer pointer = TestUtils.stringToPointer(method);
          if (pointer == null || pointer.getNode() == null || TestNodeWrapperFactory.tryToWrap(pointer.getNode()) == null) {
            return "Could not find test method for id " + method + ".";
          }
        }
      }
      return null;
    }

  },
  NODE() {

    public Iterable<ITestNodeWrapper> collect(final DefaultJUnit_Configuration configuration, MPSProject project) {
      Iterable<ITestNodeWrapper> testCases = Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
      if (configuration.getStateObject().nodes != null) {
        // legacy code here, nodes should be removed 
        // TODO remove after 2.0 release 
        testCases = Sequence.fromClosure(new ISequenceClosure<ITestNodeWrapper>() {
          public Iterable<ITestNodeWrapper> iterable() {
            return new Iterable<ITestNodeWrapper>() {
              public Iterator<ITestNodeWrapper> iterator() {
                return new YieldingIterator<ITestNodeWrapper>() {
                  private int __CP__ = 0;
                  private String _7_nodeName;
                  private ITestNodeWrapper _8_testNode;
                  private int _2_i;

                  protected boolean moveToNext() {
__loop__:
                    do {
__switch__:
                      switch (this.__CP__) {
                        case -1:
                          assert false : "Internal error";
                          return false;
                        case 2:
                          this._2_i = 0;
                        case 3:
                          if (!(_2_i < configuration.getStateObject().nodes.size())) {
                            this.__CP__ = 1;
                            break;
                          }
                          this.__CP__ = 4;
                          break;
                        case 5:
                          _2_i++;
                          this.__CP__ = 3;
                          break;
                        case 9:
                          if (_8_testNode == null) {
                            this.__CP__ = 10;
                            break;
                          }
                          this.__CP__ = 11;
                          break;
                        case 11:
                          this.__CP__ = 5;
                          this.yield(_8_testNode);
                          return true;
                        case 0:
                          this.__CP__ = 2;
                          break;
                        case 4:
                          this._7_nodeName = configuration.getStateObject().nodes.get(_2_i);
                          this._8_testNode = TestUtils.getTestCase(_7_nodeName);
                          this.__CP__ = 9;
                          break;
                        case 10:
                          this.__CP__ = 5;
                          break;
                        default:
                          break __loop__;
                      }
                    } while (true);
                    return false;
                  }
                };
              }
            };
          }
        });
      }
      return Sequence.fromIterable(testCases).union(Sequence.fromIterable(TestUtils.wrapPointerStrings(configuration.getStateObject().testCases)));
    }

    public String check(DefaultJUnit_Configuration configuration) {
      if ((configuration.getStateObject().nodes == null || configuration.getStateObject().nodes.isEmpty()) && (configuration.getStateObject().testCases == null || configuration.getStateObject().testCases.isEmpty())) {
        return "Classes list is empty.";
      }
      if (configuration.getStateObject().nodes != null) {
        for (String nodeName : ListSequence.fromList(configuration.getStateObject().nodes)) {
          if (TestUtils.getTestCase(nodeName) == null) {
            return "Could not find test case " + nodeName + ".";
          }
        }
      }
      if (configuration.getStateObject().testCases != null) {
        for (String testCase : ListSequence.fromList(configuration.getStateObject().testCases)) {
          SNodePointer pointer = TestUtils.stringToPointer(testCase);
          if (pointer == null || pointer.getNode() == null || TestNodeWrapperFactory.tryToWrap(pointer.getNode()) == null) {
            return "Could not find test case for id " + testCase + ".";
          }
        }
      }
      return null;
    }

  },
  MODEL() {

    public Iterable<ITestNodeWrapper> collect(DefaultJUnit_Configuration configuration, MPSProject project) {
      SModel model = TestUtils.getModel(configuration.getStateObject().model);
      if (model == null) {
        return Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
      }
      return TestUtils.getModelTests(model);
    }

    public String check(DefaultJUnit_Configuration configuration) {
      if (configuration.getStateObject().model == null) {
        return "Model is not selected.";
      }
      SModel model = TestUtils.getModel(configuration.getStateObject().model);
      if (model == null) {
        return "Could not find model " + configuration.getStateObject().model;
      }
      if (Sequence.fromIterable(TestUtils.getModelTests(model)).isEmpty()) {
        return "No tests found in model " + configuration.getStateObject().model + ".";
      }
      return null;
    }

  },
  MODULE() {

    public Iterable<ITestNodeWrapper> collect(DefaultJUnit_Configuration configuration, MPSProject project) {
      IModule module = TestUtils.getModule(configuration.getStateObject().module);
      if (module == null) {
        return Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
      }
      return TestUtils.getModuleTests(module);
    }

    public String check(DefaultJUnit_Configuration configuration) {
      if (StringUtils.isEmpty(configuration.getStateObject().module)) {
        return "Module is not selected.";
      }
      IModule module = TestUtils.getModule(configuration.getStateObject().module);
      if (module == null) {
        return "Module " + configuration.getStateObject().module + " does not exist.";
      }
      if (Sequence.fromIterable(TestUtils.getModuleTests(module)).isEmpty()) {
        return "No tests found in module " + configuration.getStateObject().module + "";
      }
      return null;
    }

  },
  PROJECT() {

    public Iterable<ITestNodeWrapper> collect(DefaultJUnit_Configuration configuration, MPSProject project) {
      if (project == null) {
        return Sequence.fromIterable(Collections.<ITestNodeWrapper>emptyList());
      }
      return TestUtils.getProjectTests(project);
    }

    public String check(DefaultJUnit_Configuration configuration) {
      MPSProject mpsProject = MPSDataKeys.MPS_PROJECT.getData(DataManager.getInstance().getDataContext());
      if (mpsProject != null) {
        if (Sequence.fromIterable(TestUtils.getProjectTests(mpsProject)).isEmpty()) {
          return "Project does not contain tests.";
        }
      }
      return null;
    }

  };

  JUnitRunTypes() {
  }

  public abstract Iterable<ITestNodeWrapper> collect(DefaultJUnit_Configuration configuration, MPSProject project);

  public abstract String check(DefaultJUnit_Configuration cofiguration);
}
