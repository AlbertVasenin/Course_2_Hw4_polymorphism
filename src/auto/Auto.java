package auto;

import Sponsor.Sponsor;
import auto.driver.Driver;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import mechanics.Mechanics;

public abstract class Auto<T> {

  private final String brand;
  private final String model;
  private double volumeEngine;
  private final Set<Sponsor> sponsors = new HashSet<>();
  private final Set<Mechanics<?>> mechanics = new HashSet<>();
  private final Set<Driver<?>> drivers = new HashSet<>();


  public Auto(String brand, String model, double volumeEngine) {
    this.brand = ValidateUtils.validateString(brand);
    this.model = ValidateUtils.validateString(model);
    this.volumeEngine = setVolumeEngine(volumeEngine);
  }

  public Set<Sponsor> getSponsors() {
    return sponsors;
  }

  public Set<Mechanics<?>> getMechanics() {
    return mechanics;
  }

  public Set<Driver<?>> getDrivers() {
    return drivers;
  }

  public void addSponsor(Sponsor sponsors) {
    this.sponsors.add(sponsors);
  }

  public void addMechanics(Mechanics<?> mechanics) {
    this.mechanics.add(mechanics);
  }

  public void addDrivers(Driver<?> drivers) {
    this.drivers.add(drivers);
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getVolumeEngine() {
    return volumeEngine;
  }

  public final double setVolumeEngine(double volumeEngine) {
    return this.volumeEngine = ValidateUtils.validateEngine(volumeEngine);
  }

  public abstract void startMoving();

  public abstract void endMoving();

  public abstract void printInfoAuto();

  public abstract boolean getDiagnosed();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auto<?> auto = (Auto<?>) o;
    return Double.compare(auto.volumeEngine, volumeEngine) == 0 && Objects.equals(
        brand, auto.brand) && Objects.equals(model, auto.model) && Objects.equals(
        sponsors, auto.sponsors) && Objects.equals(mechanics, auto.mechanics)
        && Objects.equals(drivers, auto.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, volumeEngine);
  }
}
