package auto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import mechanics.Mechanics;

public class Car extends Auto implements Competing {

  private final Set<Mechanics> mechanics = new HashSet<>();
  private final BodyType bodyType;

  public Car(String brand, String model, double volumeEngine, BodyType bodyType) {
    super(brand, model, volumeEngine);
    this.bodyType = bodyType;
  }

  @Override
  public Set<Mechanics> getMechanics() {
    return mechanics;
  }

  public BodyType getBodyType() {
    return bodyType;
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
    if (bodyType == null) {
      System.out.println("Данных по транспортному средству недостаточно");
    } else {
      System.out.println("Тип кузова: " + getBodyType().getBody());
    }
  }

  @Override
  public boolean getDiagnosed() {
    return Math.random() > 0.70;
  }

  @Override
  public String toString() {
    return getClass() + ", марка: " + getBrand() + ", модель: " + getModel()
        + ", объем двигателя: " + getVolumeEngine() + " литров." + getBodyType() + "\n";
  }

  @Override
  public void pitStop() {
    System.out.printf("Заезжает на пит-стоп %s %s\nВыезжает из пит-стопа %s %s\n", getBrand(),
        getModel(), getBrand(), getModel());
  }

  @Override
  public void getBestTimeLap() {
    System.out.printf("Лучшее время круга у автомобиля %s %s: %.0f мин. %.0f сек.\n", getBrand(),
        getModel(),
        (1 + Math.random() * (20)), Math.random() * 59);
  }

  @Override
  public void getMaxSpeed() {
    System.out.printf("Максимальная скорость круга у автомобиля %s %s: %.0f км/ч\n", getBrand(),
        getModel(), (100
            + Math.random() * (100)));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(mechanics, car.mechanics) && bodyType == car.bodyType;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), mechanics, bodyType);
  }
}
