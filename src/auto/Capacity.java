package auto;

public enum Capacity {
  VERY_SMALL(0, 10),
  SMALL(0, 25),
  AVERAGE(40, 50),
  BIG(60, 80),
  VERY_BIG(100, 120);
  private final Integer lowCapacity;
  private final Integer highCapacity;

  Capacity(Integer lowCapacity, Integer highCapacity) {
    this.lowCapacity = lowCapacity;
    this.highCapacity = highCapacity;
  }

  public Integer getLowCapacity() {
    return lowCapacity;
  }

  public Integer getHighCapacity() {
    return highCapacity;
  }

  @Override
  public String toString() {
    return (lowCapacity == 0) ? " Вместимость до " + highCapacity + " человек"
        : " Вместимость от " + lowCapacity + " человек " + ((highCapacity == 0) ? ""
            : "до " + highCapacity + " человек");
  }
}
