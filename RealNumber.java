public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if(value == 0 || other.getValue() == 0) {
      return getValue() == other.getValue();
    }
    return Math.abs((getValue()-other.getValue())/other.getValue()) < 0.00001;
  }
}