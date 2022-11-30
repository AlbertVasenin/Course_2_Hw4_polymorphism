package auto;

public class Truck extends Auto implements Competing {

  private final LoadType loadType;

  public Truck(String brand, String model, double volumeEngine, LoadType loadType) {
    super(brand, model, volumeEngine);
    this.loadType = loadType;
  }

  public LoadType getLoadType() {
    return loadType;
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
    if (loadType == null) {
      System.out.println("Данных по транспортному средству недостаточно");
    } else {
      System.out.println((getLoadType().getLowWeight() == null) ? " Грузоподъемность до "
          + getLoadType().getHighWeight() + " тонн"
          : "Грузоподъемность от " + getLoadType().getLowWeight() + " тонн " + (
              (getLoadType().getHighWeight() == null) ? ""
                  : "до " + getLoadType().getHighWeight() + " тонн"));
    }
  }

  @Override
  public boolean getDiagnosed() {
    return Math.random() > 0.75;
  }

  @Override
  public String toString() {
    return "Класс: " + getClass() + ", марка: " + getBrand() + ", модель: " + getModel()
        + ", объем двигателя: " + getVolumeEngine() + " литров." + getLoadType();
  }

  @Override
  public void pitStop() {
    System.out.printf("Заезжает на пит-стоп %s %s\nВыезжает из пит-стопа %s %s\n", getBrand(),
        getModel(), getBrand(), getModel());
  }

  @Override
  public void getBestTimeLap() {
    System.out.printf("Лучшее время круга у грузовика %s %s: %.0f мин. %.0f сек.\n", getBrand(),
        getModel(),
        (1 + Math.random() * (20)), Math.random() * 59);
  }

  @Override
  public void getMaxSpeed() {
    System.out.printf("Максимальная скорость круга у грузовика %s %s: %.0f км/ч\n", getBrand(),
        getModel(), (100
            + Math.random() * (100)));
  }
}
