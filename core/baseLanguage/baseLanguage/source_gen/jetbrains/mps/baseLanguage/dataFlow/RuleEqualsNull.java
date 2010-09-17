package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.analyzers.runtime.framework.DataFlowConstructor;
import jetbrains.mps.lang.pattern.GeneratedMatchingPattern;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.pattern.IMatchingPattern;
import jetbrains.mps.lang.dataFlow.framework.instructions.Instruction;

public class RuleEqualsNull extends DataFlowConstructor {
  private GeneratedMatchingPattern myPattern = new RuleEqualsNull.Pattern_vwsftd_a0a();

  public RuleEqualsNull() {
  }

  public boolean isApplicable(SNode node) {
    return myPattern.match(node);
  }

  public void performActions(Program program, SNode node) {
    myPattern.performActions(program);
  }

  public static class Pattern_vwsftd_a0a extends GeneratedMatchingPattern implements IMatchingPattern {
    /*package*/ SNode PatternVar_p;
    /*package*/ SNode PatternVar_ifBody;
    /*package*/ SNode PatternVar_elseBody;
    /*package*/ SNode PatternVar_if;
    private GeneratedMatchingPattern myOrPattern_vwsftd_a0a0;

    public Pattern_vwsftd_a0a() {
    }

    public boolean match(SNode nodeToMatch) {
      {
        SNode nodeToMatch_vwsftd_a0a;
        nodeToMatch_vwsftd_a0a = nodeToMatch;
        PatternVar_if = nodeToMatch_vwsftd_a0a;
        if (!("jetbrains.mps.baseLanguage.structure.IfStatement".equals(nodeToMatch_vwsftd_a0a.getConceptFqName()))) {
          return false;
        }
        {
          String childRole_vwsftd_ = "ifTrue";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd_) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd_).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0;
              nodeToMatch_vwsftd_a0a0 = childVar_vwsftd_a0a0;
              if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_vwsftd_a0a0.getConceptFqName()))) {
                return false;
              }
            }
            this.PatternVar_ifBody = childVar_vwsftd_a0a0;
          }
        }
        {
          String childRole_vwsftd__0 = "condition";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd__0) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0_0 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd__0).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0_0;
              nodeToMatch_vwsftd_a0a0_0 = childVar_vwsftd_a0a0_0;
              {
                boolean orMatches = false;
                GeneratedMatchingPattern orPattern;
                orPattern = new RuleEqualsNull.Pattern_vwsftd_a0a.Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_vwsftd_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_vwsftd_a0a0 = orPattern;
                }
                orPattern = new RuleEqualsNull.Pattern_vwsftd_a0a.Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a();
                if (orPattern.match(nodeToMatch_vwsftd_a0a0_0)) {
                  orMatches = true;
                  myOrPattern_vwsftd_a0a0 = orPattern;
                }
                if (!(orMatches)) {
                  return false;
                }
              }
            }
          }
        }
        {
          String childRole_vwsftd__5 = "ifFalseStatement";
          if (nodeToMatch_vwsftd_a0a.getChildCount(childRole_vwsftd__5) != 1) {
            return false;
          }
          {
            SNode childVar_vwsftd_a0a0_1 = nodeToMatch_vwsftd_a0a.getChildren(childRole_vwsftd__5).get(0);
            {
              SNode nodeToMatch_vwsftd_a0a0_1;
              nodeToMatch_vwsftd_a0a0_1 = childVar_vwsftd_a0a0_1;
              if (!("jetbrains.mps.baseLanguage.structure.BlockStatement".equals(nodeToMatch_vwsftd_a0a0_1.getConceptFqName()))) {
                return false;
              }
              {
                String childRole_vwsftd__6 = "statements";
                if (nodeToMatch_vwsftd_a0a0_1.getChildCount(childRole_vwsftd__6) != 1) {
                  return false;
                }
                {
                  SNode childVar_vwsftd_a0a0a = nodeToMatch_vwsftd_a0a0_1.getChildren(childRole_vwsftd__6).get(0);
                  {
                    SNode nodeToMatch_vwsftd_a0a0a;
                    nodeToMatch_vwsftd_a0a0a = childVar_vwsftd_a0a0a;
                    if (!("jetbrains.mps.baseLanguage.structure.StatementList".equals(nodeToMatch_vwsftd_a0a0a.getConceptFqName()))) {
                      return false;
                    }
                  }
                  this.PatternVar_elseBody = childVar_vwsftd_a0a0a;
                }
              }
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
        this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        this.PatternVar_ifBody = (SNode) pattern.getFieldValue("PatternVar_ifBody");
        this.PatternVar_elseBody = (SNode) pattern.getFieldValue("PatternVar_elseBody");
        this.PatternVar_if = (SNode) pattern.getFieldValue("PatternVar_if");
      }
    }

    public Object getFieldValue(String fieldName) {
      if ("PatternVar_p".equals(fieldName)) {
        return myOrPattern_vwsftd_a0a0.getFieldValue(fieldName);
      }
      if ("PatternVar_ifBody".equals(fieldName)) {
        return this.PatternVar_ifBody;
      }
      if ("PatternVar_elseBody".equals(fieldName)) {
        return this.PatternVar_elseBody;
      }
      if ("PatternVar_if".equals(fieldName)) {
        return this.PatternVar_if;
      }
      return null;
    }

    public void performActions(Object o) {
      {
        int position = 0;
        Object object = getFieldValue("PatternVar_ifBody");
        if (((Program) o).contains(object)) {
          position = ((Program) (o)).getStart(object);
          Instruction instruction = new nullInstruction((SNode) getFieldValue("PatternVar_p"));
          instruction.setSource(getFieldValue("PatternVar_ifBody"));
          ((Program) (o)).insert(instruction, position, true);
        }
      }
      {
        int position = 0;
        Object object = getFieldValue("PatternVar_elseBody");
        if (((Program) o).contains(object)) {
          position = ((Program) (o)).getStart(object);
          Instruction instruction = new notNullInstruction((SNode) getFieldValue("PatternVar_p"));
          instruction.setSource(getFieldValue("PatternVar_elseBody"));
          ((Program) (o)).insert(instruction, position, true);
        }
      }
      {
        int position = 0;
        Object object = getFieldValue("PatternVar_if");
        if (((Program) o).contains(object)) {
          position = ((Program) (o)).getEnd(object);
          Instruction instruction = new nullableInstruction((SNode) getFieldValue("PatternVar_p"));
          instruction.setSource(getFieldValue("PatternVar_if"));
          ((Program) (o)).insert(instruction, position, true);
        }
      }
    }

    public static class Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_vwsftd_a0a0a2a2a1a1a1a1a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_vwsftd_a0a0a0;
          nodeToMatch_vwsftd_a0a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_vwsftd_a0a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_vwsftd__1 = "leftExpression";
            if (nodeToMatch_vwsftd_a0a0a0.getChildCount(childRole_vwsftd__1) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0a0a0a = nodeToMatch_vwsftd_a0a0a0.getChildren(childRole_vwsftd__1).get(0);
              {
                SNode nodeToMatch_vwsftd_a0a0a0a;
                nodeToMatch_vwsftd_a0a0a0a = childVar_vwsftd_a0a0a0a;
                PatternVar_p = nodeToMatch_vwsftd_a0a0a0a;
              }
            }
          }
          {
            String childRole_vwsftd__2 = "rightExpression";
            if (nodeToMatch_vwsftd_a0a0a0.getChildCount(childRole_vwsftd__2) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0a0a0a_0 = nodeToMatch_vwsftd_a0a0a0.getChildren(childRole_vwsftd__2).get(0);
              {
                SNode nodeToMatch_vwsftd_a0a0a0a_0;
                nodeToMatch_vwsftd_a0a0a0a_0 = childVar_vwsftd_a0a0a0a_0;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_vwsftd_a0a0a0a_0.getConceptFqName()))) {
                  return false;
                }
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
          this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_p".equals(fieldName)) {
          return this.PatternVar_p;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }

    public static class Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a extends GeneratedMatchingPattern implements IMatchingPattern {
      /*package*/ SNode PatternVar_p;

      public Pattern_vwsftd_a0a0a3a2a1a1a1a1a1a3a0a0a0a() {
      }

      public boolean match(SNode nodeToMatch) {
        {
          SNode nodeToMatch_vwsftd_a1a0a0;
          nodeToMatch_vwsftd_a1a0a0 = nodeToMatch;
          if (!("jetbrains.mps.baseLanguage.structure.EqualsExpression".equals(nodeToMatch_vwsftd_a1a0a0.getConceptFqName()))) {
            return false;
          }
          {
            String childRole_vwsftd__3 = "leftExpression";
            if (nodeToMatch_vwsftd_a1a0a0.getChildCount(childRole_vwsftd__3) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0b0a0a = nodeToMatch_vwsftd_a1a0a0.getChildren(childRole_vwsftd__3).get(0);
              {
                SNode nodeToMatch_vwsftd_a0b0a0a;
                nodeToMatch_vwsftd_a0b0a0a = childVar_vwsftd_a0b0a0a;
                if (!("jetbrains.mps.baseLanguage.structure.NullLiteral".equals(nodeToMatch_vwsftd_a0b0a0a.getConceptFqName()))) {
                  return false;
                }
              }
            }
          }
          {
            String childRole_vwsftd__4 = "rightExpression";
            if (nodeToMatch_vwsftd_a1a0a0.getChildCount(childRole_vwsftd__4) != 1) {
              return false;
            }
            {
              SNode childVar_vwsftd_a0b0a0a_0 = nodeToMatch_vwsftd_a1a0a0.getChildren(childRole_vwsftd__4).get(0);
              {
                SNode nodeToMatch_vwsftd_a0b0a0a_0;
                nodeToMatch_vwsftd_a0b0a0a_0 = childVar_vwsftd_a0b0a0a_0;
                PatternVar_p = nodeToMatch_vwsftd_a0b0a0a_0;
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
          this.PatternVar_p = (SNode) pattern.getFieldValue("PatternVar_p");
        }
      }

      public Object getFieldValue(String fieldName) {
        if ("PatternVar_p".equals(fieldName)) {
          return this.PatternVar_p;
        }
        return null;
      }

      public void performActions(Object o) {
      }
    }
  }
}
