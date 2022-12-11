package auto;

public enum LoadType {
  N1(null, 3.5f),
  N2(3.5f, 12.0f),
  N3(12.0f, null);
  private final Float lowWeight;
  private final Float highWeight;

  LoadType(Float lowWeight, Float highWeight) {
    this.lowWeight = lowWeight;
    this.highWeight = highWeight;
  }

  public Float getLowWeight() {
    return lowWeight;
  }

  public Float getHighWeight() {
    return highWeight;
  }

  @Override
  public String toString() {
    return (lowWeight == null) ? " Грузоподъемность до " + highWeight + " тонн"
        : " Грузоподъемность от " + lowWeight + " тонн " + ((highWeight == null) ? ""
            : "до " + highWeight + " тонн");
  }
}
