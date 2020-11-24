public class RealNumber extends Number{
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
  public RealNumber subtract(RealNumber other){
    RealNumber difference=new RealNumber(getValue()-other.getValue());
    return difference;
  }
}
