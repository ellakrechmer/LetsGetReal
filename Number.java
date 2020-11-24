public abstract class Number  {
  public abstract double getValue();
  public int compareTo(Number other){
    if (this.getValue()>other.getValue()) return 1;
    else if (this.getValue()<other.getValue()) return -1;
    else return 0;
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
}
