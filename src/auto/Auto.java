package auto;

import java.util.Objects;

public abstract class Auto {

  private final String brand;
  private final String model;
  private double volumeEngine;

  public Auto(String brand, String model, double volumeEngine) {
    this.brand = ValidateUtils.validateString(brand);
    this.model = ValidateUtils.validateString(model);
    this.volumeEngine = setVolumeEngine(volumeEngine);
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

  @Override
  public String toString() {
    return "Auto{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        ", volumeEngine=" + volumeEngine +
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
