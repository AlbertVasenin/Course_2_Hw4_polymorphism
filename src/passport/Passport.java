package passport;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {

  private final String number;
  private String name;
  private String surname;
  private String lastName;
  private LocalDate birthday;

  public Passport(String number, String name, String surname, String lastName, LocalDate birthday) {
    this.number = number;
    this.name = name;
    this.surname = surname;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Passport passport = (Passport) o;
    return Objects.equals(number, passport.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }

  @Override
  public String toString() {
    return "\nПаспорт " +
        "номер: " + number +
        ", имя: " + name +
        ", фамилия: " + surname +
        ", отчество: " + lastName +
        ", родился: " + birthday;
  }
}
