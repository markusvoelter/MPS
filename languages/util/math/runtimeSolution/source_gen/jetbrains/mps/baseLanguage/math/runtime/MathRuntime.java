package jetbrains.mps.baseLanguage.math.runtime;

/*Generated by MPS */

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.BigInteger;

public class MathRuntime {
  public MathRuntime() {
  }

  /*package*/ static BigDecimal sqrt(BigDecimal bd, MathContext context) {
    if (bd.scale() % 2 != 0) {
      bd = bd.setScale(bd.scale() + 1);
    }
    int scale = bd.scale() / 2;
    BigInteger bi = bd.unscaledValue();
    double l = context.getPrecision() * 10.0 / 3.0;
    int i = (int) (Math.round(l));
    bi = bi.shiftLeft(2 * i);
    BigInteger op = bi;
    BigInteger res = BigInteger.ZERO;
    int bL = (op.bitLength() - 1) / 2;
    BigInteger one = BigInteger.ONE;
    one = one.shiftLeft(bL * 2);
    while (!(one.equals(BigInteger.ZERO))) {
      BigInteger t = res.add(one);
      if (op.compareTo(t) >= 0) {
        op = op.subtract(t);
        res = res.add(one.shiftLeft(1));
      }
      res = res.shiftRight(1);
      one = one.shiftRight(2);
    }
    BigDecimal result = new BigDecimal(res).divide(new BigDecimal(BigInteger.ONE.shiftLeft(i))).round(context);
    return result.divide(BigDecimal.ONE.scaleByPowerOfTen(scale));
  }
}
