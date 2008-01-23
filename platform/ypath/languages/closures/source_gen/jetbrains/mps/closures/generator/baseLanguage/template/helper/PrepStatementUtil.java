package jetbrains.mps.closures.generator.baseLanguage.template.helper;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;

public class PrepStatementUtil {

  public static void prepStatementList(SNode slist, ITemplateGenerator generator) {
    PrepStatementUtil.Context ctx = new PrepStatementUtil.Context();
    PrepStatementUtil.prepStatementList(slist, ctx, generator);
  }

  private static void prepStatementList(SNode slist, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    for(SNode stmt : SLinkOperations.getTargets(slist, "statement", true)) {
      if(SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.WhileStatement")) {
        PrepStatementUtil.prepWhileStatement(stmt, ctx, generator);
      } else
      if(SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.ForStatement")) {
        PrepStatementUtil.prepForStatement(stmt, ctx, generator);
      } else
      if(SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement")) {
        PrepStatementUtil.prepLocalvariableDeclarationStatement(stmt, ctx, generator);
      } else
      if(SNodeOperations.isInstanceOf(stmt, "jetbrains.mps.closures.structure.YieldStatement")) {
        PrepStatementUtil.prepYieldStatement(stmt, ctx, generator);
      }
    }
  }

  private static void prepWhileStatement(SNode wstmt, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    ctx.incrementLabel();
    int beginLabel = ctx.label;
    PrepStatementUtil.prepStatementList(SLinkOperations.getTarget(wstmt, "body", true), ctx, generator);
    int endLabel = ctx.label + 1;
    PrepStatementUtil.putPrepData(wstmt, new Integer[]{beginLabel,endLabel}, generator);
  }

  private static void prepForStatement(SNode fstmt, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    ctx.incrementLabel();
    int beginLabel = ctx.label;
    PrepStatementUtil.prepLocalVariableDeclaration(SLinkOperations.getTarget(fstmt, "variable", true), ctx, generator);
    ctx.incrementLabel();
    int condLabel = ctx.label;
    // ctx.incrementLabel()
    ctx.incrementLabel();
    int blockLabel = ctx.label;
    PrepStatementUtil.prepStatementList(SLinkOperations.getTarget(fstmt, "body", true), ctx, generator);
    ctx.incrementLabel();
    int postLabel = ctx.label;
    int endLabel = ctx.label + 1;
    PrepStatementUtil.putPrepData(fstmt, new Integer[]{beginLabel,condLabel,blockLabel,postLabel,endLabel}, generator);
  }

  public static void prepLocalvariableDeclarationStatement(SNode lstmt, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    ctx.incrementLabel();
    PrepStatementUtil.putPrepData(lstmt, ctx.label, generator);
    PrepStatementUtil.prepLocalVariableDeclaration(SLinkOperations.getTarget(lstmt, "localVariableDeclaration", true), ctx, generator);
  }

  private static void prepLocalVariableDeclaration(SNode lvd, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    String name = "_" + ctx.label + "_" + SPropertyOperations.getString(lvd, "name");
    PrepStatementUtil.putPrepData(lvd, name, generator);
  }

  public static void prepYieldStatement(SNode ystmt, PrepStatementUtil.Context ctx, ITemplateGenerator generator) {
    ctx.incrementLabel();
    int beginLabel = ctx.label;
    int endLabel = ctx.label + 1;
    PrepStatementUtil.putPrepData(ystmt, new Integer[]{beginLabel,endLabel}, generator);
  }

  public static void putPrepData(SNode sn, Object data, ITemplateGenerator generator) {
    generator.getGeneratorSessionContext().putSessionObject("closure_data_" + ((SNode)sn).getId(), data);
  }

  public static Object getPrepData(SNode sn, ITemplateGenerator generator) {
    return generator.getGeneratorSessionContext().getSessionObject("closure_data_" + ((SNode)sn).getId());
  }

  private static class Context {

    public int label;

    public  Context() {
      this.label = 0;
    }

    public void incrementLabel() {
      this.label = this.label + 1;
    }

}

}
