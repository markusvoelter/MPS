package jetbrains.mps.lang.pattern.test;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.lang.test.runtime.BaseTransformationTest;
import org.junit.Test;
import jetbrains.mps.lang.test.runtime.BaseTestBody;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import junit.framework.Assert;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;
import jetbrains.mps.lang.pattern.IMatchingPattern;

@MPSLaunch
public class PatternProperty_Test extends BaseTransformationTest {
  public PatternProperty_Test() {
  }

  @Test
  public void testMethod() throws Throwable {
    this.initTest("${mps_home}/plugins/vcs/vcs.mpr", "r:ef0e231b-e6bd-436f-9003-b53de4081716(jetbrains.mps.lang.pattern.test)");
    this.runTest("jetbrains.mps.lang.pattern.test.PatternProperty_Test$TestBody", "testProperty", true);
  }

  @MPSLaunch
  public static class TestBody extends BaseTestBody {
    public TestBody() {
    }

    public void testProperty() {
      assertTrue(match());

    }

    public boolean match() {
      SNode nodeToMatch = new PatternProperty_Test.TestBody.QuotationClass_xihehy_a0a0a1a().createNode();
      GeneratedMatchingPattern pattern = new PatternProperty_Test.TestBody.Pattern_xihehy_a0a1a1a();
      boolean matchNeeded = true;
      boolean matches = pattern.match(nodeToMatch);
      if (matchNeeded != matches) {
        return false;
      }
      if (!(matchNeeded)) {
        return true;
      }
      Assert.assertEquals("something", (String) pattern.getFieldValue("patternVar_printed"));
      return true;
    }

    public static class QuotationClass_xihehy_a0a0a1a {
      public QuotationClass_xihehy_a0a0a1a() {
      }

      public SNode createNode() {
        SNode result = null;
        Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
        SNode quotedNode_1 = null;
        SNode quotedNode_2 = null;
        SNode quotedNode_3 = null;
        SNode quotedNode_4 = null;
        {
          quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_1;
          {
            quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticFieldReference", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_6 = quotedNode_2;
            quotedNode1_6.addReference(SReference.create("classifier", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~System")));
            quotedNode1_6.addReference(SReference.create("variableDeclaration", quotedNode1_6, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.lang(JDK/java.lang@java_stub)"), SNodeId.fromString("~System.out")));
            quotedNode_1.addChild("operand", quotedNode1_6);
          }
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_7 = quotedNode_3;
            quotedNode1_7.addReference(SReference.create("baseMethodDeclaration", quotedNode1_7, SModelReference.fromString("f:java_stub#6354ebe7-c22a-4a0f-ac54-50b52ab9b065#java.io(JDK/java.io@java_stub)"), SNodeId.fromString("~PrintStream.println(java.lang.String):void")));
            {
              quotedNode_4 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StringLiteral", null, GlobalScope.getInstance(), false);
              SNode quotedNode1_8 = quotedNode_4;
              quotedNode1_8.setProperty("value", "something");
              quotedNode_3.addChild("actualArgument", quotedNode1_8);
            }
            quotedNode_1.addChild("operation", quotedNode1_7);
          }
          result = quotedNode1_5;
        }
        return result;
      }
    }

    public static class Pattern_xihehy_a0a1a1a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode patternVar_field;
      /*package*/ SNode patternVar_className;
      /*package*/ SNode patternVar_method;
      /*package*/ String patternVar_printed;

      public Pattern_xihehy_a0a1a1a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_ru5khm_a0;
          nodeToMatch_ru5khm_a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.DotExpression".equals(nodeToMatch_ru5khm_a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_ru5khm_ = "operation";
            if (nodeToMatch_ru5khm_a0.getChildCount(childRole_ru5khm_) != 1) {
              return false;
            }
            {
              SNode childVar_ru5khm_a0a = nodeToMatch_ru5khm_a0.getChildren(childRole_ru5khm_).get(0);
              {
                SNode nodeToMatch_ru5khm_a0a;
                nodeToMatch_ru5khm_a0a = childVar_ru5khm_a0a;
                if (!("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation".equals(nodeToMatch_ru5khm_a0a.getConceptFqName()))) {
                  return false;
                }
                patternVar_method = nodeToMatch_ru5khm_a0a.getReferent("baseMethodDeclaration");
                {
                  String childRole_ru5khm__0 = "actualArgument";
                  if (nodeToMatch_ru5khm_a0a.getChildCount(childRole_ru5khm__0) != 1) {
                    return false;
                  }
                  {
                    SNode childVar_ru5khm_a0a0 = nodeToMatch_ru5khm_a0a.getChildren(childRole_ru5khm__0).get(0);
                    {
                      SNode nodeToMatch_ru5khm_a0a0;
                      nodeToMatch_ru5khm_a0a0 = childVar_ru5khm_a0a0;
                      if (!("jetbrains.mps.baseLanguage.structure.StringLiteral".equals(nodeToMatch_ru5khm_a0a0.getConceptFqName()))) {
                        return false;
                      }
                      patternVar_printed = nodeToMatch_ru5khm_a0a0.getProperty("value");
                    }
                  }
                }
              }
            }
          }
          {
            String childRole_ru5khm__1 = "operand";
            if (nodeToMatch_ru5khm_a0.getChildCount(childRole_ru5khm__1) != 1) {
              return false;
            }
            {
              SNode childVar_ru5khm_a0a_0 = nodeToMatch_ru5khm_a0.getChildren(childRole_ru5khm__1).get(0);
              {
                SNode nodeToMatch_ru5khm_a0a_0;
                nodeToMatch_ru5khm_a0a_0 = childVar_ru5khm_a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.StaticFieldReference".equals(nodeToMatch_ru5khm_a0a_0.getConceptFqName()))) {
                  return false;
                }
                patternVar_field = nodeToMatch_ru5khm_a0a_0.getReferent("variableDeclaration");
                patternVar_className = nodeToMatch_ru5khm_a0a_0.getReferent("classifier");
              }
            }
          }
        }
        return true;
      }

      public boolean hasAntiquotations() {
        return false;
      }

      public void fillFieldValuesFrom(GeneratedMatchingPattern pattern) {
        if (pattern != null && pattern.getClass() == this.getClass()) {
          patternVar_field = (SNode) pattern.getFieldValue("patternVar_field");
          patternVar_className = (SNode) pattern.getFieldValue("patternVar_className");
          patternVar_method = (SNode) pattern.getFieldValue("patternVar_method");
          patternVar_printed = (String) pattern.getFieldValue("patternVar_printed");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("patternVar_field".equals(fieldName)) {
          return patternVar_field;
        }
        if ("patternVar_className".equals(fieldName)) {
          return patternVar_className;
        }
        if ("patternVar_method".equals(fieldName)) {
          return patternVar_method;
        }
        if ("patternVar_printed".equals(fieldName)) {
          return patternVar_printed;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }
  }
}
