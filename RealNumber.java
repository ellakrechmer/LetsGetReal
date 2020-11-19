public class RealNumber{
  private double value;
  public RealNumber(double v){
    value=v;
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return ""+value;
  }
  public boolean equals(RealNumber other){
    if (other.getValue()==0 || getValue()==0) {
      if (other.getValue()==0 && getValue()==0) return true;
      else return false;
    }
    else if (Math.abs((other.getValue()-getValue()))<0.00001*other.getValue()
             && Math.abs((other.getValue()-getValue()))<0.00001*getValue()) {
      return true;
    }
    return false;
  }
  public RealNumber add(RealNumber other){
    RealNumber sum=new RealNumber(getValue()+other.getValue());
    return sum;
  }
  public RealNumber multiply(RealNumber other){
    RealNumber product=new RealNumber(getValue()*other.getValue());
    return product;
  }
  public RealNumber divide(RealNumber other){
    RealNumber quotient=new RealNumber(getValue()/other.getValue());
    return quotient;
  }
}
