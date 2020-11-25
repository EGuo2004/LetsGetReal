public abstract class Number{
  public abstract double getValue();

  public int compareTo(Number other){
    if (equals(other) == true) {
      return 0;
    } else {
      if (getValue() - other.getValue() > 0) {
        return 1;
      } else {
        return -1;
      }
    }
  }

  public boolean equals(Number other){
    if(getValue() == 0 || other.getValue() == 0) {
      return getValue() == other.getValue();
    }
    return Math.abs((getValue()-other.getValue())/other.getValue()) < 0.00001;
  }
}
