public class RationalNumber extends Number {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno) {
    super();
    numerator = nume;
    denominator = deno;
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      if (deno < 0) {
        numerator = numerator * -1;
        denominator = denominator * -1;
      }
      if (nume != 0) {
        reduce();
      }
    }
  }

  public double getValue() {

    return ((double)numerator / denominator);
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
     for (remainder = x % y; remainder != 0; remainder = x % y) { 
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
    return x;
  }

  public RationalNumber divide(RationalNumber other) {
    RationalNumber x = new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
    return x;
  }

  public RationalNumber add(RationalNumber other) {
    RationalNumber z = new RationalNumber(((numerator * other.getDenominator()) + (other.getNumerator() * denominator)), (denominator * other.getDenominator()));
    return z;
  }

  public RationalNumber subtract(RationalNumber other) {
    RationalNumber z = new RationalNumber(((numerator * other.getDenominator()) - (other.getNumerator() * denominator)), (denominator * other.getDenominator()));
    return z;
  }
}
