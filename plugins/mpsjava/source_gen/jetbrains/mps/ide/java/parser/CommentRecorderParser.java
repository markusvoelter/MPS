package jetbrains.mps.ide.java.parser;

/*Generated by MPS */

import org.eclipse.jdt.internal.compiler.parser.Parser;
import org.eclipse.jdt.internal.compiler.problem.ProblemReporter;
import org.eclipse.jdt.internal.compiler.classfmt.ClassFileConstants;
import org.eclipse.jdt.internal.compiler.ast.CompilationUnitDeclaration;
import org.eclipse.jdt.internal.compiler.impl.CompilerOptions;
import org.eclipse.jdt.internal.compiler.problem.ProblemSeverities;

public class CommentRecorderParser extends Parser {
  protected static final int CommentIncrement = 100;

  /*package*/ int[] commentStops = new int[10];
  /*package*/ int[] commentStarts = new int[10];
  /*package*/ int commentPtr = -1;

  public CommentRecorderParser(ProblemReporter problemReporter, boolean optimizeStringLiterals) {
    super(problemReporter, optimizeStringLiterals);
  }

  public void checkComment() {
    if (!((this.diet && this.dietInt == 0)) && this.scanner.commentPtr >= 0) {
      flushCommentsDefinedPriorTo(this.endStatementPosition);
    }
    boolean deprecated = false;
    boolean checkDeprecated = false;
    int lastCommentIndex = -1;
nextComment:
    for (; lastCommentIndex >= 0; lastCommentIndex--) {
      int commentSourceStart = this.scanner.commentStarts[lastCommentIndex];
      if ((commentSourceStart < 0) || (this.modifiersSourceStart != -1 && this.modifiersSourceStart < commentSourceStart) || (this.scanner.commentStops[lastCommentIndex] < 0)) {
        continue nextComment;
      }
      checkDeprecated = true;
      int commentSourceEnd = this.scanner.commentStops[lastCommentIndex] - 1;
      this.javadocParser.reportProblems = this.currentElement == null || commentSourceEnd > this.lastJavadocEnd;
      deprecated = this.javadocParser.checkDeprecation(lastCommentIndex);
      this.javadoc = this.javadocParser.docComment;
      break nextComment;
    }
    if (deprecated) {
      checkAndSetModifiers(ClassFileConstants.AccDeprecated);
    }
    if (lastCommentIndex >= 0 && checkDeprecated) {
      this.modifiersSourceStart = this.scanner.commentStarts[lastCommentIndex];
      if (this.modifiersSourceStart < 0) {
        this.modifiersSourceStart = -this.modifiersSourceStart;
      }
    }
  }

  protected void consumeClassHeader() {
    pushOnCommentsStack(0, this.scanner.commentPtr);
    super.consumeClassHeader();
  }

  protected void consumeEmptyTypeDeclaration() {
    pushOnCommentsStack(0, this.scanner.commentPtr);
    super.consumeEmptyTypeDeclaration();
  }

  protected void consumeInterfaceHeader() {
    pushOnCommentsStack(0, this.scanner.commentPtr);
    super.consumeInterfaceHeader();
  }

  public boolean containsComment(int sourceStart, int sourceEnd) {
    int iComment = this.scanner.commentPtr;
    for (; iComment >= 0; iComment--) {
      int commentStart = this.scanner.commentStarts[iComment];
      if (commentStart < 0) {
        commentStart = -commentStart;
      }
      if (commentStart < sourceStart) {
        continue;
      }
      if (commentStart > sourceEnd) {
        continue;
      }
      return true;
    }
    return false;
  }

  protected CompilationUnitDeclaration endParse(int act) {
    CompilationUnitDeclaration unit = super.endParse(act);
    if (unit.comments == null) {
      pushOnCommentsStack(0, this.scanner.commentPtr);
      unit.comments = getCommentsPositions();
    }
    return unit;
  }

  public int flushCommentsDefinedPriorTo(int position) {
    int lastCommentIndex = this.scanner.commentPtr;
    if (lastCommentIndex < 0) {
      return position;
    }
    int index = lastCommentIndex;
    int validCount = 0;
    while (index >= 0) {
      int commentEnd = this.scanner.commentStops[index];
      if (commentEnd < 0) {
        commentEnd = -commentEnd;
      }
      if (commentEnd <= position) {
        break;
      }
      index--;
      validCount++;
    }
    if (validCount > 0) {
      int immediateCommentEnd = 0;
      while (index < lastCommentIndex && (immediateCommentEnd = -this.scanner.commentStops[index + 1]) > 0) {
        immediateCommentEnd--;
        if (this.scanner.getLineNumber(position) != this.scanner.getLineNumber(immediateCommentEnd)) {
          break;
        }
        position = immediateCommentEnd;
        validCount--;
        index++;
      }
    }
    if (index < 0) {
      return position;
    }
    pushOnCommentsStack(0, index);
    switch (validCount) {
      case 0:
        break;
      case 2:
        this.scanner.commentStarts[0] = this.scanner.commentStarts[index + 1];
        this.scanner.commentStops[0] = this.scanner.commentStops[index + 1];
        this.scanner.commentTagStarts[0] = this.scanner.commentTagStarts[index + 1];
        this.scanner.commentStarts[1] = this.scanner.commentStarts[index + 2];
        this.scanner.commentStops[1] = this.scanner.commentStops[index + 2];
        this.scanner.commentTagStarts[1] = this.scanner.commentTagStarts[index + 2];
        break;
      case 1:
        this.scanner.commentStarts[0] = this.scanner.commentStarts[index + 1];
        this.scanner.commentStops[0] = this.scanner.commentStops[index + 1];
        this.scanner.commentTagStarts[0] = this.scanner.commentTagStarts[index + 1];
        break;
      default:
        System.arraycopy(this.scanner.commentStarts, index + 1, this.scanner.commentStarts, 0, validCount);
        System.arraycopy(this.scanner.commentStops, index + 1, this.scanner.commentStops, 0, validCount);
        System.arraycopy(this.scanner.commentTagStarts, index + 1, this.scanner.commentTagStarts, 0, validCount);
    }
    this.scanner.commentPtr = validCount - 1;
    return position;
  }

  public int[][] getCommentsPositions() {
    int[][] positions = new int[this.commentPtr + 1][2];
    for (int i = 0, max = this.commentPtr; i <= max; i++) {
      positions[i][0] = this.commentStarts[i];
      positions[i][1] = this.commentStops[i];
    }
    return positions;
  }

  public void initialize(boolean initializeNLS) {
    super.initialize(initializeNLS);
    this.commentPtr = -1;
  }

  public void initialize() {
    super.initialize();
    this.commentPtr = -1;
  }

  public void initializeScanner() {
    this.scanner = new CommentRecorderScanner(false, false, this.options.getSeverity(CompilerOptions.NonExternalizedString) != ProblemSeverities.Ignore, this.options.sourceLevel, this.options.taskTags, this.options.taskPriorites, this.options.isTaskCaseSensitive);
  }

  private void pushOnCommentsStack(int start, int end) {
    for (int i = start; i <= end; i++) {
      int scannerStart = (this.scanner.commentStarts[i] < 0 ?
        -this.scanner.commentStarts[i] :
        this.scanner.commentStarts[i]
      );
      int commentStart = (this.commentPtr == -1 ?
        -1 :
        ((this.commentStarts[this.commentPtr] < 0 ?
          -this.commentStarts[this.commentPtr] :
          this.commentStarts[this.commentPtr]
        ))
      );
      if (commentStart == -1 || scannerStart > commentStart) {
        int stackLength = this.commentStarts.length;
        if (++this.commentPtr >= stackLength) {
          System.arraycopy(this.commentStarts, 0, this.commentStarts = new int[stackLength + CommentIncrement], 0, stackLength);
          System.arraycopy(this.commentStops, 0, this.commentStops = new int[stackLength + CommentIncrement], 0, stackLength);
        }
        this.commentStarts[this.commentPtr] = this.scanner.commentStarts[i];
        this.commentStops[this.commentPtr] = this.scanner.commentStops[i];
      }
    }
  }

  protected void resetModifiers() {
    pushOnCommentsStack(0, this.scanner.commentPtr);
    super.resetModifiers();
  }
}
