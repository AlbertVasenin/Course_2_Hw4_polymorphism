package auto;

public class Car extends Auto {

  public Car(String brand, String model, double volumeEngine) {
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
