package auto;

public class Bus extends Auto {

  public Bus(String brand, String model, double volumeEngine) {
    super(brand, model, volumeEngine);
  }

  @Override
  public void startMoving() {

  }

  @Override
  public void endMoving() {

  }

  @Override
  public String toString() {
    return "Класс: " + getClass() + ", марка: " + getBrand() + ", модель: " + getModel()
        + ", объем двигателя: " + getVolumeEngine() + " литров.";
  }
}
