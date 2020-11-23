public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super(nume/deno);
    numerator = nume;
    denominator = deno;
  }

  public double getValue() {
    return numerator/denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }
}
