package auto;

import Sponsor.Sponsor;
import auto.driver.Driver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import mechanics.Mechanics;

public abstract class Auto {

  private final String brand;
  private final String model;
  private double volumeEngine;
  private final List<Sponsor> sponsors = new ArrayList<>();
  private final List<Mechanics<?>> mechanics = new ArrayList<>();
  private final List<Driver<?>> drivers = new ArrayList<>();


  public Auto(String brand, String model, double volumeEngine) {
    this.brand = ValidateUtils.validateString(brand);
    this.model = ValidateUtils.validateString(model);
    this.volumeEngine = setVolumeEngine(volumeEngine);
  }

  public List<Sponsor> getSponsors() {
    return sponsors;
  }

  public List<Mechanics<?>> getMechanics() {
    return mechanics;
  }

  public List<Driver<?>> getDrivers() {
    return drivers;
  }

  public void addSponsor(Sponsor... sponsors) {
    this.sponsors.addAll(Arrays.asList(sponsors));
  }

  public void addMechanics(Mechanics<?>... mechanics) {
    this.mechanics.addAll(Arrays.asList(mechanics));
  }

  public void addDrivers(Driver<?>... drivers) {
    this.drivers.addAll(Arrays.asList(drivers));
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
  public String toString() {
    return "Auto{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", volumeEngine=" + volumeEngine +
        ", sponsors=" + sponsors +
        ", mechanics=" + mechanics +
        ", drivers=" + drivers +
        '}';

  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auto auto = (Auto) o;
    return Double.compare(auto.volumeEngine, volumeEngine) == 0 && Objects.equals(
        brand, auto.brand) && Objects.equals(model, auto.model);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, volumeEngine);
  }
}
