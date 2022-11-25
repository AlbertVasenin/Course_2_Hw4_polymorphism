package auto.driver;

import auto.ValidateUtils;

public abstract class Driver {

  private final String fullName;
  private boolean drivingLicense;
  private int experience;

  public Driver(String fullName, boolean drivingLicense, int experience) {
    this.fullName = ValidateUtils.validateString(fullName);
    this.drivingLicense = drivingLicense;
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
    this.drivingLicense = drivingLicense;
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
