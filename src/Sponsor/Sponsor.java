package Sponsor;

import auto.ValidateUtils;

public class Sponsor {

  private String name;
  private double sumSupport;

  public Sponsor(String name, double sumSupport) {
    this.name = setName(name);
    this.sumSupport = setSumSupport(sumSupport);
  }

  public String getName() {
    return name;
  }

  public String setName(String name) {
    this.name = ValidateUtils.validateString(name);
    return name;
  }

  public double getSumSupport() {
    return sumSupport;
  }

  public double setSumSupport(double sumSupport) {
    this.sumSupport = (sumSupport <= 0) ? 100_000 : sumSupport;
    return sumSupport;
  }

  public void supportTheRace() {
    System.out.println("Спонсирует заезд " + getName());
  }

  @Override
  public String toString() {
    return String.format("Спонсор: %s на сумму %.2f рублей", getName(), getSumSupport());
  }
}
