public class RationalNumber extends RealNumber{
  private int numerator, denominator;
  public RationalNumber(int nume, int deno){
    super(0.0);
    if (deno==0) {
      numerator=0;
      denominator=1;
    }
    else if (nume<0 && deno<0) {
      numerator=Math.abs(nume);
      denominator=Math.abs(deno);
    }
    else if (deno<0){
      numerator=0-nume;
      denominator=Math.abs(deno);
    }
    else {
      numerator=nume;
      denominator=deno;
    }
    reduce();
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
    if (denominator==1) return ""+numerator;
    else return numerator+"/"+denominator;
  }
  private static int gcd(int a, int b){
    if (a<b){
      int storea=a;
      a=b;
      b=storea;
    }
    while (b!=0 && a%b!=0) {
      int r=a%b;
      a=b;
      b=r;
    }
    int gcd=b;
    return gcd;
  }
  private void reduce(){
    int gcd=gcd(numerator,denominator);
    if (gcd!=0) {
      numerator/=gcd;
      denominator/=gcd;
    }
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
  private static int lcm(int a, int b){
    int gcd=gcd(a,b);
    a/=gcd;
    b/=gcd;
    int lcm=a*b*gcd;
    return lcm;
  }
  public RationalNumber add(RationalNumber other){
    int newdeno=lcm(getDenominator(), other.getDenominator());
    int thisnewnume=(newdeno/getDenominator())*getNumerator();
    int othernewnume=(newdeno/other.getDenominator())*other.getNumerator();
    RationalNumber sum= new RationalNumber(thisnewnume+othernewnume, newdeno);
    return sum;
  }
  public RationalNumber subtract(RationalNumber other){
    int newdeno=lcm(getDenominator(), other.getDenominator());
    int thisnewnume=(newdeno/getDenominator())*getNumerator();
    int othernewnume=(newdeno/other.getDenominator())*other.getNumerator();
    RationalNumber diff=new RationalNumber(thisnewnume-othernewnume, newdeno);
    return diff;
  }
}
