package auto.driver;

import auto.Car;

public class DriverB<B extends Car> extends Driver {

  public DriverB(String fullName, boolean drivingLicense, int experience) {
    super(fullName, drivingLicense, experience);
  }

  @Override
  public void startMoving() {
    System.out.println("Водитель " + getFullName() + " стартовал");
  }

  @Override
  public void stopMoving() {
    System.out.println("Водитель " + getFullName() + " остановился");
  }

  @Override
  public void refuel() {
    System.out.println("Водитель " + getFullName() + " стартовал");
  }

  public void toStringForStart(B Car) {
    System.out.printf("Водитель: %s, автомобиль %s %s, будет участвовать в заезде\n", getFullName(),
        Car.getBrand(), Car.getModel());
  }
}
