public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno==0) {
      numerator=0;
      denominator=1;
    }
    else {
      numerator=nume;
      denominator=deno;
    }
  }
  public double getValue(){
    return (double) numerator/denominator;
  }
  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
  public RationalNumber reciprocal(){
    RationalNumber recip=new RationalNumber(getDenominator(), getNumerator());
    return recip;
  }
  public boolean equals(RationalNumber other){
    if (getNumerator()==other.getNumerator() && getDenominator()==other.getDenominator()) {
      return true;
    }
    return false;
  }
  public String toString(){
    return numerator+"/"+denominator;
  }
  private static int gcd(int a, int b){
    if (a<b){
      int storea=a;
      a=b;
      b=storea;
    }
    while (a%b!=0) {
      int r=a%b;
      a=b;
      b=r;
    }
    int gcd=b;
    return gcd;
  }
  private void reduce(){
    int gcd=gcd(numerator,denominator);
    numerator/=gcd;
    denominator/=gcd;
  }
  public RationalNumber multiply(RationalNumber other){
    int newnume=getNumerator()*other.getNumerator();
    int newdeno=getDenominator()*other.getDenominator();
    RationalNumber product=new RationalNumber(newnume, newdeno);
    return product;
  }
  public RationalNumber divide(RationalNumber other){
    return this.multiply(other.reciprocal());
  }
}
