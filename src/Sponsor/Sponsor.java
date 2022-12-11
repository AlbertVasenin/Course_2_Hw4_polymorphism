package Sponsor;

import auto.ValidateUtils;
import java.util.Objects;

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sponsor sponsor = (Sponsor) o;
    return Double.compare(sponsor.sumSupport, sumSupport) == 0 && Objects.equals(
        name, sponsor.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, sumSupport);
  }

  @Override
  public String toString() {
    return "Спонсор: " + name + ", сумма спонсора: " + sumSupport +
        " рублей";
  }
}
