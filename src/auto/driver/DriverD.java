package auto.driver;

import auto.Bus;

public class DriverD<D extends Bus> extends Driver{

  public DriverD(String fullName, boolean drivingLicense, int experience) {
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

  public void toStringForStart(D car) {
    System.out.printf("Водитель: %s, автомобиль %s %s, будет участвовать в заезде\n", getFullName(),
        car.getBrand(), car.getModel());
  }
}
