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

}
