package auto.driver;

import auto.ValidateUtils;

public abstract class Driver<T> {

  private final String fullName;
  private boolean drivingLicense;
  private int experience;

  public Driver(String fullName, boolean drivingLicense, int experience) {
    this.fullName = ValidateUtils.validateString(fullName);
    setDrivingLicense(drivingLicense);
    this.experience = ValidateUtils.validateExperience(experience);
  }

  public abstract void startMoving();

  public abstract void stopMoving();

  public abstract void refuel();

  public final String getFullName() {
    return fullName;
  }

  public boolean isDrivingLicense() {
    return drivingLicense;
  }

  public void setDrivingLicense(boolean drivingLicense) {
    if (!drivingLicense) {
      throw new IllegalArgumentException("У водителя должны быть права на эту категорию");
    } else {
      this.drivingLicense = true;
    }
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }

  @Override
  public String toString() {
    return "Водитель: " + fullName +
        ", наличие прав " + drivingLicense +
        ", опыт " + experience +
        " лет";
  }
}
