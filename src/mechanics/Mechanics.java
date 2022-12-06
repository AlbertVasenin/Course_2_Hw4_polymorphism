package mechanics;

import auto.Auto;
import auto.ValidateUtils;

public class Mechanics<T> {

  private String name;
  private String secondName;
  private String company;

  public Mechanics(String name, String secondName, String company) {
    this.name = setName(name);
    this.secondName = setSecondName(secondName);
    this.company = setCompany(company);
  }

  public String getName() {
    return name;
  }

  public String setName(String name) {
    this.name = ValidateUtils.validateString(name);
    return name;
  }

  public String getSecondName() {
    return secondName;
  }

  public String setSecondName(String secondName) {
    this.secondName = ValidateUtils.validateString(secondName);
    return secondName;
  }

  public String getCompany() {
    return company;
  }

  public String setCompany(String company) {
    this.company = ValidateUtils.validateString(company);
    return company;
  }

  public void serviceAuto() {
    System.out.println("Обслуживаю авто ");
  }

  public void repairAuto() {
    System.out.println("Ремонтирую авто ");
  }

  @Override
  public String toString() {
    return "Механик: " + name + " " + secondName + " " +
        ", компания " + company;
  }
}
