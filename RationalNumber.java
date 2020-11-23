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

  public RationalNumber reciprocal(){
   return new RationalNumber(denominator, numerator);
 }

 public boolean equals(RationalNumber other){
   return (numerator == other.getNumerator() && denominator == other.getDenominator());
 }

 public String toString(){
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b) {
    int x = Math.max(a,b);
    int y = Math.min(a,b);
    int remainder;
    for (remainder = 1; remainder != 0;) {
      remainder = x % y;
      if (remainder != 0) {
        x = y;
        y = remainder;
      }
    }
    return y;
  }

  private void reduce() {
    int x = gcd(numerator, denominator);
    numerator = numerator/x;
    denominator = denominator/x;
  }

  public RationalNumber multiply(RationalNumber other) {
    RationalNumber x = new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
    x.reduce();
    return x;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber x = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
    x.reduce();
    return x;
  }

  public RationalNumber add(RationalNumber other) {
    RationalNumber z = new RationalNumber(((numerator * other.getDenominator()) + (other.getNumerator() * denominator)), (denominator * getDenominator()));
    z.reduce();
    return z;
  }

  public RationalNumber subtract(RationalNumber other) {
    RationalNumber z = new RationalNumber(((numerator * other.getDenominator()) - (other.getNumerator() * denominator)), (denominator * getDenominator()));
    z.reduce();
    return z;
  }
}
