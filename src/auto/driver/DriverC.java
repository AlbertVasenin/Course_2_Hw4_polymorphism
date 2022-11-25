package auto.driver;

import auto.Truck;

public class DriverC<C extends Truck> extends Driver {

  public DriverC(String fullName, boolean drivingLicense, int experience) {
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
    System.out.println("Водитель " + getFullName() + " заправляется");
  }

  public void toStringForStart(C Car) {
    System.out.printf("Водитель: %s, автомобиль %s %s, будет участвовать в заезде\n", getFullName(),
        Car.getBrand(), Car.getModel());
  }
}
