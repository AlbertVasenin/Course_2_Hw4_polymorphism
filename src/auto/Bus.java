package auto;

public class Bus extends Auto implements Competing {

  private final Capacity capacity;

  public Bus(String brand, String model, double volumeEngine, Capacity capacity) {
    super(brand, model, volumeEngine);
    this.capacity = capacity;
  }

  public Capacity getCapacity() {
    return capacity;
  }

  @Override
  public void startMoving() {
    System.out.printf("Начинает движение %s %s \n", getBrand(), getModel());
  }

  @Override
  public void endMoving() {
    System.out.printf("Заканчивает движение %s %s \n", getBrand(), getModel());
  }

  @Override
  public void printInfoAuto() {
    if (capacity == null) {
      System.out.println("Данных по транспортному средству недостаточно");
    } else {
      System.out.println((getCapacity().getLowCapacity() == 0) ? " Вместимость до "
          + getCapacity().getHighCapacity() + " человек"
          : "Вместимость от " + getCapacity().getLowCapacity() + " человек " + (
              (getCapacity().getHighCapacity() == 0) ? ""
                  : "до " + getCapacity().getHighCapacity() + " человек"));
    }
  }

  @Override
  public String toString() {
    return "Класс: " + getClass() + ", марка: " + getBrand() + ", модель: " + getModel()
        + ", объем двигателя: " + getVolumeEngine() + " литров." + getCapacity();
  }

  @Override
  public void pitStop() {
    System.out.printf("Заезжает на пит-стоп %s %s\nВыезжает из пит-стопа %s %s\n", getBrand(),
        getModel(), getBrand(), getModel());
  }

  @Override
  public void getBestTimeLap() {
    System.out.printf("Лучшее время круга у автобуса %s %s: %.0f мин. %.0f сек.\n", getBrand(),
        getModel(),
        (1 + Math.random() * (20)), Math.random() * 59);
  }

  @Override
  public void getMaxSpeed() {
    System.out.printf("Максимальная скорость круга автобуса %s %s: %.0f км/ч\n", getBrand(),
        getModel(), (100
            + Math.random() * (100)));
  }
}
