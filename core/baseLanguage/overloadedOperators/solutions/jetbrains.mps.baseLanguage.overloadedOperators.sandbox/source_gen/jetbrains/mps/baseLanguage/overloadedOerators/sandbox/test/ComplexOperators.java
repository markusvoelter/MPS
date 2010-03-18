package jetbrains.mps.baseLanguage.overloadedOerators.sandbox.test;

/*Generated by MPS */


public class ComplexOperators {
  public ComplexOperators() {
  }

  public static Complex apply_PlusExpression_Complex_Complex(Complex left, Complex right) {
    Complex res = new Complex();
    res.set(left.getRe() + right.getRe(), left.getIm() + right.getIm());
    return res;
  }

  public static Complex apply_MulExpression_Complex_Complex(Complex left, Complex right) {
    Complex res = new Complex();
    res.set(left.getRe() * right.getRe() - left.getIm() * right.getIm(), left.getRe() * right.getIm() + left.getIm() * right.getRe());
    return res;
  }

  public static Complex2 apply_PlusExpression_Complex_Complex2(Complex left, Complex2 right) {
    Complex2 res = new Complex2();
    res.set(left.getRe() + right.getRe(), left.getIm() + right.getIm());
    return res;
  }

  public static Complex2 apply_PlusExpression_Complex2_Complex2(Complex2 left, Complex2 right) {
    Complex2 res = new Complex2();
    res.set(left.getRe() + right.getRe(), left.getIm() + right.getIm());
    return res;
  }
}
